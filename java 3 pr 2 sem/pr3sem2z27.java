import java.util.Scanner;

public class LongestPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        int maxLength = findLongestPalindromeLength(input);
        System.out.println("Длина самого длинного палиндрома: " + maxLength);
        scanner.close();
    }

    public static int findLongestPalindromeLength(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Проверяем палиндромы с нечетной длиной
            int len1 = expandAroundCenter(s, i, i);
            // Проверяем палиндромы с четной длиной
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return end - start + 1; // Возвращаем длину палиндрома
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Длина палиндрома
    }
}
