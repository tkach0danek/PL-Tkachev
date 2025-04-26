import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntervalCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите интервалы в формате [start1, end1], [start2, end2], ... : ");
        String input = scanner.nextLine();
        
        int totalCount = calculateTotalNumbers(input);
        System.out.println("Общее количество уникальных чисел: " + totalCount);
    }

    public static int calculateTotalNumbers(String input) {
        // Удаляем пробелы и разбиваем строку на интервалы
        input = input.replaceAll("\s+", "");
        String[] intervals = input.split("\],\[");
        
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (String interval : intervals) {
            // Удаляем квадратные скобки
            interval = interval.replaceAll("[\[\]]", "");
            String[] bounds = interval.split(",");

            if (bounds.length == 2) {
                try {
                    int start = Integer.parseInt(bounds[0]);
                    int end = Integer.parseInt(bounds[1]);

                    // Добавляем все числа в диапазоне от start до end (включительно)
                    for (int i = start; i <= end; i++) {
                        uniqueNumbers.add(i);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, используйте целые числа.");
                }
            }
        }

        return uniqueNumbers.size(); // Возвращаем количество уникальных чисел
    }
}
