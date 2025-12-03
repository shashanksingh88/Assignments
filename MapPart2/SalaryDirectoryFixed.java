import java.util.*;

public class SalaryDirectoryFixed {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
        map.put("A", 45000.0);
        map.put("B", 52000.0);
        map.put("C", 60000.0);
        map.put("D", 30000.0);
        map.put("E", 55000.0);

        // give raise to C
        map.put("C", map.get("C") * 1.10);

        // compute sum and max (first pass)
        double sum = 0;
        for (double sal : map.values()) {
            sum += sal;
        }

        // compute max using Collections.max on the values (second pass)
        double max = Collections.max(map.values());

        System.out.println("Avg salary: " + (sum / map.size()));

        System.out.println("Highest paid:");
        // now 'max' is effectively final (not modified), safe to use in lambda
        map.forEach((k, v) -> {
            if (v == max) System.out.println(k + " : " + v);
        });
    }
}

