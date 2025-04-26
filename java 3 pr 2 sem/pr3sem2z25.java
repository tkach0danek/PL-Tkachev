import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfDivisiblesInRange {

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
        System.out.println("Сумма чисел от " + M + " до " + N + " которые делятся на указанные делители: " + sum);
        
        scanner.close();
    }

    public static int calculateSum(int M, int N, List<Integer> divisors) {
        int sum = 0;

        for (int i = M; i <= N; i++) {
            for (int divisor : divisors) {
                if (i % divisor == 0) {
                    sum += i;
                    break; // Если нашли делитель, выходим из внутреннего цикла
                }
            }
        }

        return sum;
    }
}
