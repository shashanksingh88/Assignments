import java.util.Scanner;

public class LeapYear1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year (>=1582): ");
        int y = sc.nextInt();

        if (y < 1582) {
            System.out.println("Year not valid (Gregorian calendar starts from 1582)");
        } else {
            if (y % 400 == 0) System.out.println("Leap Year");
            else if (y % 100 == 0) System.out.println("Not a Leap Year");
            else if (y % 4 == 0) System.out.println("Leap Year");
            else System.out.println("Not a Leap Year");
        }
    }
}