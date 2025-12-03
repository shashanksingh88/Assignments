import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {
        Map<String,Double> map = new TreeMap<>();

        map.put("Rahul", 85.0);
        map.put("Aman", 90.0);
        map.put("Sita", 78.5);

        map.put("Rahul", 92.0);      // update
        map.remove("Aman");          // remove

        for(var e : map.entrySet()){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
