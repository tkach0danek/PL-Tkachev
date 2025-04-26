import java.util.Scanner;
import java.util.Arrays;

public class MaxValueSplitter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод массива чисел
        System.out.println("Введите количество элементов в массиве:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Поиск максимального значения и его индекса
        int maxIndex = -1;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Формирование массивов слева и справа от максимума
        int[] leftArray = Arrays.copyOfRange(numbers, 0, maxIndex);
        int[] rightArray = Arrays.copyOfRange(numbers, maxIndex + 1, numbers.length);

        // Вывод результатов
        System.out.println("Максимальное значение: " + maxValue);
        System.out.println("Элементы слева от максимума: " + Arrays.toString(leftArray));
        System.out.println("Элементы справа от максимума: " + Arrays.toString(rightArray));
    }
}
