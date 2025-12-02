import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Physics marks: ");
        int phy = sc.nextInt();
        System.out.print("Chemistry marks: ");
        int chem = sc.nextInt();
        System.out.print("Maths marks: ");
        int math = sc.nextInt();

        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average = " + avg);

        if (avg >= 90) System.out.println("Grade A - Excellent");
        else if (avg >= 75) System.out.println("Grade B - Good");
        else if (avg >= 50) System.out.println("Grade C - Average");
        else System.out.println("Grade D - Poor");
    }
}