
import java.util.*;

public class VisitTracker {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String[] pages = {"home","about","products","home","products","contact","home"};

        for(String p : pages){
            map.put(p, map.getOrDefault(p,0)+1);
        }

        map.entrySet().stream()
            .sorted((a,b)->b.getValue()-a.getValue())
            .forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));

        String maxPage = "";
        int max = 0;
        for(var e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                maxPage = e.getKey();
            }
        }

        System.out.println("Most visited: "+maxPage);
    }
}
