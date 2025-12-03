import java.util.*;

public class CourseReg {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("CS101", 45);
        map.put("MATH1", 4);
        map.put("PHY1", 60);

        map.put("CS101", map.get("CS101") + 5);   // add students
        map.put("MATH1", Math.max(0, map.get("MATH1") - 2));

        System.out.println("Near full (>=50):");
        map.forEach((c,v)->{
            if(v>=50) System.out.println(c+" : "+v);
        });

        System.out.println("Under (<5):");
        map.forEach((c,v)->{
            if(v<5) System.out.println(c+" : "+v);
        });
    }
}

