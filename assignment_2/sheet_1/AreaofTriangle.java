import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516; // 1 in² = 6.4516 cm²
        System.out.println("Area in square inches = " + areaInches + " and in square centimeters = " + areaCm);
    }
}