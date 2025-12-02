import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i+1) + ": ");
            salary[i] = sc.nextDouble();
            System.out.println("Enter years of service of employee " + (i+1) + ": ");
            yearsOfService[i] = sc.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Enter again.");
                i--; // decrement index to re-enter
                continue;
            }
        }

        // Calculate bonus & new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Company Bonus Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i+1) + " -> Old Salary: " + salary[i] +
                    ", Bonus: " + bonus[i] + ", New Salary: " + newSalary[i]);
        }
        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
