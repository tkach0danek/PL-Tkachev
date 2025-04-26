import java.util.Scanner;

public class SumOfDivisibles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        
        System.out.print("Введите первый делитель: ");
        int divisor1 = scanner.nextInt();
        
        System.out.print("Введите второй делитель: ");
        int divisor2 = scanner.nextInt();

        // Вычисление суммы
        int sum = calculateSum(N, divisor1, divisor2);
        
        // Вывод результата
        System.out.println("Сумма чисел от 1 до " + N + " которые делятся на " + divisor1 + " или " + divisor2 + ": " + sum);
        
        scanner.close();
    }

    public static int calculateSum(int N, int divisor1, int divisor2) {
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % divisor1 == 0 || i % divisor2 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
