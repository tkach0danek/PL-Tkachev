import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Введите длину первого отрезка: ");
        double a = scanner.nextDouble();
        
        System.out.print("Введите длину второго отрезка: ");
        double b = scanner.nextDouble();
        
        System.out.print("Введите длину третьего отрезка: ");
        double c = scanner.nextDouble();
        
        
        if (canFormTriangle(a, b, c)) {
            System.out.println("Из данных отрезков можно составить треугольник.");
            double largestExternalAngle = calculateLargestExternalAngle(a, b, c);
            System.out.println("Наибольший внешний угол треугольника: " + largestExternalAngle + " градусов.");
        } else {
            System.out.println("Из данных отрезков нельзя составить треугольник.");
        }
        
        scanner.close(); 
    }
    
    
    public static boolean canFormTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    
    public static double calculateLargestExternalAngle(double a, double b, double c) {
        
        double angleA = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double angleB = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double angleC = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        
        
        angleA = Math.toDegrees(angleA);
        angleB = Math.toDegrees(angleB);
        angleC = Math.toDegrees(angleC);
        
        
        double smallestInternalAngle = Math.min(angleA, Math.min(angleB, angleC));
        
        
        return 180 - smallestInternalAngle;
    }
}
