import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SpiralArray {

    public static void main(String[] args) {
        int h = 5; // высота
        int n = 5; // ширина

        int[][] array = new int[h][n];
        fillSpiral(array, h, n);
        writeToFile(array, "output.txt");
    }

    public static void fillSpiral(int[][] array, int h, int n) {
        int value = 1; // Начальное значение для заполнения
        int top = 0, bottom = h - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // Заполнение верхней строки
            for (int i = left; i <= right; i++) {
                array[top][i] = value;
            }
            top++;

            // Заполнение правого столбца
            for (int i = top; i <= bottom; i++) {
                array[i][right] = value;
            }
            right--;

            // Заполнение нижней строки
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    array[bottom][i] = value;
                }
                bottom--;
            }

            // Заполнение левого столбца
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    array[i][left] = value;
                }
                left++;
            }

            // Увеличиваем значение для следующего кольца
            value++;
        }
    }

    public static void writeToFile(int[][] array, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int[] row : array) {
                for (int value : row) {
                    writer.write(value + " ");
                }
                writer.newLine();
            }
            System.out.println("Результат успешно записан в файл " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
