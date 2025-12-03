
import java.util.*;

class Employee {
    String name, dept;
    Employee(String n, String d){ name=n; dept=d; }
}

public class GroupByDept {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Alice","HR"),
            new Employee("Bob","IT"),
            new Employee("Carol","HR")
        );

        Map<String,List<Employee>> map = new HashMap<>();

        for(Employee e : list){
            map.computeIfAbsent(e.dept, k-> new ArrayList<>()).add(e);
        }

        map.forEach((d,emp)->{
            System.out.print(d + ": ");
            emp.forEach(x -> System.out.print(x.name+" "));
            System.out.println();
        });
    }
}

