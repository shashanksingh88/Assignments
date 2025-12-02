
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // [physics, chemistry, maths]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks for student " + (i+1) + ": ");
            marks[i][0] = sc.nextInt();
            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--;
                continue;
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'D';
        }

        System.out.println("\n--- Student Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + " -> Physics: " + marks[i][0] +
                    ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2] +
                    ", %: " + percentage[i] + ", Grade: " + grade[i]);
        }

        sc.close();
    }
}
