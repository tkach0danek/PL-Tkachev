import java.util.Scanner;

public class CentroidCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координаты треугольника в формате '([x1, y1], [x2, y2], [x3, y3])': ");
        String input = scanner.nextLine();

        input = input.replaceAll("[\[\]() ]", "");
        String[] coordinates = input.split(",");

        double x1 = Double.parseDouble(coordinates[0]);
        double y1 = Double.parseDouble(coordinates[1]);
        double x2 = Double.parseDouble(coordinates[2]);
        double y2 = Double.parseDouble(coordinates[3]);
        double x3 = Double.parseDouble(coordinates[4]);
        double y3 = Double.parseDouble(coordinates[5]);

        double Gx = (x1 + x2 + x3) / 3;
        double Gy = (y1 + y2 + y3) / 3;

        System.out.printf("Барицентр треугольника: {%.4f, %.4f}%n", Gx, Gy);

        scanner.close();
    }
}
