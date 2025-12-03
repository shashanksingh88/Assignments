import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("India","Delhi");
        map.put("USA","Washington");
        map.put("Japan","Tokyo");
        map.put("China","Beijing");

        System.out.println(map.getOrDefault("India","Unknown country"));

        map.forEach((c,cap)-> System.out.println(c+" : "+cap));
    }
}

