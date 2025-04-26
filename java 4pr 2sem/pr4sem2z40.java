import java.util.ArrayList;
import java.util.List;

public class RangeFormatter {

    public static void main(String[] args) {
        int[] numbers = {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        String result = formatRanges(numbers);
        System.out.println(result);
    }

    public static String formatRanges(int[] numbers) {
        if (numbers.length == 0) {
            return "";
        }

        List<String> ranges = new ArrayList<>();
        int start = numbers[0];
        int end = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == end + 1) {
                // Продолжаем диапазон
                end = numbers[i];
            } else {
                // Завершаем текущий диапазон
                addRange(ranges, start, end);
                start = numbers[i];
                end = numbers[i];
            }
        }
        
        // Добавляем последний диапазон
        addRange(ranges, start, end);

        return String.join(",", ranges);
    }

    private static void addRange(List<String> ranges, int start, int end) {
        if (start == end) {
            ranges.add(String.valueOf(start));
        } else {
            ranges.add(start + "-" + end);
        }
    }
}
