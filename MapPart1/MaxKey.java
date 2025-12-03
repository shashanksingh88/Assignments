
import java.util.*;

public class MaxKey {
    public static void main(String[] args) {
        Map<String,Integer> map = Map.of("A",10,"B",20,"C",15);

        String ans = "";
        int max = Integer.MIN_VALUE;

        for(var e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }

        System.out.println(ans);
    }
}
