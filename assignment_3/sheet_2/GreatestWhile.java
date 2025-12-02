import java.util.Scanner;

public class GreatestWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int gf = 1, i = n - 1;
        while (i >= 1) {
            if (n % i == 0) {
                gf = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor (besides itself): " + gf);
    }
}