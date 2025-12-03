
import java.util.*;

public class ExamResult {
    public static void main(String[] args) {
        Map<String,Map<String,Integer>> map = new HashMap<>();

        map.put("Math", Map.of("A",90,"B",88,"C",95));
        map.put("Science", Map.of("A",70,"B",92,"C",85));

        for(String sub : map.keySet()){
            int max = -1;
            String top = "";
            int sum = 0, count = 0;

            for(var e : map.get(sub).entrySet()){
                sum += e.getValue();
                count++;
                if(e.getValue() > max){
                    max = e.getValue();
                    top = e.getKey();
                }
            }

            System.out.println(sub+" Topper: "+top+" ("+max+")");
            System.out.println("Avg: "+(sum/count));
        }

        System.out.println("Subjects with marks > 90:");
        for(String sub : map.keySet()){
            for(int v : map.get(sub).values()){
                if(v > 90){
                    System.out.println(sub);
                    break;
                }
            }
        }
    }
}
