import java.util.Scanner;

public class PyramidMaxSlidingSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уровни пирамиды (вводите числа через пробел):");

        // Чтение уровней пирамиды
        String[] levels = new String[4]; // Предполагаем 4 уровня
        for (int i = 0; i < 4; i++) {
            levels[i] = scanner.nextLine();
        }

        // Преобразование строк в двумерный массив
        int[][] pyramid = new int[levels.length][];
        for (int i = 0; i < levels.length; i++) {
            String[] numbers = levels[i].trim().split("\s+");
            pyramid[i] = new int[numbers.length];
            for (int j = 0; j < numbers.length; j++) {
                pyramid[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        // Вычисление максимальной суммы скольжения
        int maxSum = calculateMaxSlidingSum(pyramid);
        System.out.println("Максимальная сумма скольжения: " + maxSum);
    }

    public static int calculateMaxSlidingSum(int[][] pyramid) {
        // Начинаем с предпоследнего уровня и двигаемся вверх
        for (int i = pyramid.length - 2; i >= 0; i--) {
            for (int j = 0; j < pyramid[i].length; j++) {
                // Смотрим на два соседних элемента ниже
                int leftChild = pyramid[i + 1][j];
                int rightChild = pyramid[i + 1][j + 1];

                // Обновляем текущее значение, добавляя максимальное из двух возможных детей
                pyramid[i][j] += Math.max(leftChild, rightChild);
            }
        }
        // Вершина пирамиды теперь содержит максимальную сумму
        return pyramid[0][0];
    }
}
