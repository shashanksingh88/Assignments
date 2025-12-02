import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double w = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double h = sc.nextDouble();

        double hm = h / 100.0; // convert cm to m
        double bmi = w / (hm * hm);
        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}