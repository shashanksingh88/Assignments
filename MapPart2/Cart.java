
import java.util.*;

public class Cart {
    public static void main(String[] args) {
        Map<String,Double> map = new LinkedHashMap<>();

        map.put("Laptop",40000.0);
        map.put("Mouse",500.0);
        map.put("Keyboard",1200.0);

        map.forEach((k,v)-> System.out.println(k+" : "+v));

        double total = 0;
        for(double p : map.values()) total += p;

        if(total > 5000) total *= 0.90;

        System.out.println("Total bill: "+total);
    }
}

