import java.util.Scanner;

public class NextGreaterPermutation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int number = scanner.nextInt();
        
        int nextGreater = findNextGreater(number);
        System.out.println(nextGreater);
        
        scanner.close();
    }

    public static int findNextGreater(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int length = digits.length;

        // 1. Найти "разделитель"
        int i = length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // Если не найден "разделитель", значит перестановка невозможна
        if (i < 0) {
            return -1;
        }

        // 2. Найти цифру, которую нужно поменять с "разделителем"
        int j = length - 1;
        while (j > i && digits[j] <= digits[i]) {
            j--;
        }

        // 3. Меняем местами
        swap(digits, i, j);

        // 4. Переворачиваем все цифры после "разделителя"
        reverse(digits, i + 1, length - 1);

        // Преобразуем обратно в число
        long result = Long.parseLong(new String(digits));
        
        // Проверяем на переполнение
        return result > Integer.MAX_VALUE ? -1 : (int) result;
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}
