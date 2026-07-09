import java.util.Scanner;

public class ScannerPractice {
    
    static void areraOfRectangle() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length of Rectangle");
            double length = scanner.nextDouble();
            System.out.println("Enter the breath of Rectangle");
            double breath = scanner.nextDouble();
            double area = length * breath;
            System.out.println("Area of triangle is " + area);
            scanner.close();20
        }
    static void areraOfTriangle() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter length of Traingle");
            double length = scanner.nextDouble();
            System.out.println("Enter the height of Triangle");
            double breath = scanner.nextDouble();
            double area = 0.5 * length * breath;
            System.out.println("Area of triangle is " + area);
            scanner.close();
        }
    static void simpleIntrest() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Principal Amount");
            double principal = scanner.nextDouble();
            System.out.println("Enter intrest rate");
            double intrest = scanner.nextDouble();
            System.out.println("Enter time in year");
            double time = scanner.nextDouble();
            double si = (principal * intrest * time)/100;
            System.out.println("Simple Intrest is " + si);
            scanner.close();
        }
    public static void main(String[] args) {
        // areraOfRectangle();
        // areraOfTriangle();
        
    }
}
