import java.util.*;

public class WordFreq {
    public static void main(String[] args) {
        String s = "Java is fun and Java is powerful";
        s = s.toLowerCase().replaceAll("[^a-z ]", "");
        String[] w = s.split("\\s+");

        Map<String,Integer> map = new HashMap<>();

        for(String x : w){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        System.out.println(map);
    }
}

