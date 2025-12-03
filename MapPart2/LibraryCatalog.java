import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("978-111", "Java");
        map.put("978-222", "Python");
        map.put("978-333", "C++");

        String isbn = "978-222";
        System.out.println(map.getOrDefault(isbn,"Book not found"));

        map.remove("978-333");

        map.forEach((k,v)-> System.out.println(k+" → "+v));

        // search by title
        String title = "Java";
        for(var e : map.entrySet()){
            if(e.getValue().equalsIgnoreCase(title))
                System.out.println("Found at ISBN: "+e.getKey());
        }
    }
}
