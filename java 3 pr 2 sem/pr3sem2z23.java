public class TriangleArea {

    public static void main(String[] args) {
        double sideA = 5.0;
        double sideB = 6.0;
        double sideC = 7.0;

        double area = calculateTriangleArea(sideA, sideB, sideC);
        
        if (area >= 0) {
            System.out.printf("Площадь треугольника: %.2f\n", area);
        } else {
            System.out.println("Треугольник с такими сторонами не существует.");
        }
    }

    public static double calculateTriangleArea(double a, double b, double c) {
        // Проверка на существование треугольника
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1; // Возвращаем -1, если треугольник не существует
        }

        // Полупериметр
        double semiPerimeter = (a + b + c) / 2;

        // Площадь по формуле Герона
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
        
        return area;
    }
}
