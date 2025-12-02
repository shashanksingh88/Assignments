import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num, sum = 0;
        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        if (sum == num) System.out.println("Armstrong");
        else System.out.println("Not Armstrong");
    }
}