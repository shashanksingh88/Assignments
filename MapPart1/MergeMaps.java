
import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> m1 = Map.of("A",1,"B",2);
        Map<String,Integer> m2 = Map.of("B",3,"C",4);

        Map<String,Integer> res = new HashMap<>(m1);

        for(var e : m2.entrySet()){
            res.put(e.getKey(), res.getOrDefault(e.getKey(),0) + e.getValue());
        }

        System.out.println(res);
    }
}

