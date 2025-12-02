import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (<100): ");
        int n = sc.nextInt();

        if (n <= 0 || n >= 100) {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("Multiples of " + n + " below 100:");
        int i = 100;
        while (i >= 1) {
            if (i % n == 0) System.out.println(i);
            i--;
        }
    }
}