import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        System.out.println("Factors of " + n + ":");
        int i = 1;
        while (i < n) {
            if (n % i == 0) System.out.println(i);
            i++;
        }
    }
}