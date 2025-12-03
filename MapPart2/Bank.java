
import java.util.*;

public class Bank {
    public static void main(String[] args) {
        Map<String,Double> map = new HashMap<>();

        map.put("AC1", 5000.0);
        map.put("AC2", 12000.0);
        map.put("AC3", 8000.0);

        map.put("AC1", map.get("AC1") + 2000); // deposit
        double withdraw = 3000;
        if(map.get("AC2") >= withdraw)
            map.put("AC2", map.get("AC2") - withdraw);

        map.entrySet().stream()
            .sorted((a,b)->Double.compare(b.getValue(),a.getValue()))
            .forEach(e->System.out.println(e.getKey()+" : "+e.getValue()));
    }
}

