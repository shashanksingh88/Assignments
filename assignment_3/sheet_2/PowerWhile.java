import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int num = sc.nextInt();
        System.out.print("Enter power: ");
        int pow = sc.nextInt();

        long result = 1;
        int i = 0;
        while (i < pow) {
            result *= num;
            i++;
        }
        System.out.println(num + "^" + pow + " = " + result);
    }
}