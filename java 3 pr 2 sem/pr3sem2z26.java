import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbersDivisibleByAll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод первых двух чисел для определения диапазона
        System.out.print("Введите число M: ");
        int M = scanner.nextInt();
        
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        // Считываем делители
        List<Integer> divisors = new ArrayList<>();
        System.out.println("Введите делители (введите 0 для завершения ввода):");
        
        while (true) {
            int divisor = scanner.nextInt();
            if (divisor == 0) {
                break; // Завершение ввода делителей
            }
            divisors.add(divisor);
        }

        // Вычисление суммы
        int sum = calculateSum(M, N, divisors);
        
        // Вывод результата
        System.out.println("Сумма чисел от " + M + " до " + N + " которые делятся на все указанные делители: " + sum);
        
        scanner.close();
    }

    public static int calculateSum(int M, int N, List<Integer> divisors) {
        int sum = 0;

        for (int i = M; i <= N; i++) {
            if (isDivisibleByAll(i, divisors)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isDivisibleByAll(int number, List<Integer> divisors) {
        for (int divisor : divisors) {
            if (number % divisor != 0) {
                return false; // Если число не делится на хотя бы один делитель, возвращаем false
            }
        }
        return true; // Если число делится на все делители, возвращаем true
    }
}
