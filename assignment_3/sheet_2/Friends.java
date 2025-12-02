import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int ageA = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageB = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageC = sc.nextInt();

        System.out.print("Enter Amar's height: ");
        int hA = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int hB = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int hC = sc.nextInt();

        // Youngest
        if (ageA < ageB && ageA < ageC) System.out.println("Youngest: Amar");
        else if (ageB < ageC) System.out.println("Youngest: Akbar");
        else System.out.println("Youngest: Anthony");

        // Tallest
        if (hA > hB && hA > hC) System.out.println("Tallest: Amar");
        else if (hB > hC) System.out.println("Tallest: Akbar");
        else System.out.println("Tallest: Anthony");
    }
}