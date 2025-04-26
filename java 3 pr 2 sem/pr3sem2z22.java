import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumpadToPhoneKeyboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите числа с нумпада: ");
        String input = scanner.nextLine();

        String result = convertNumpadToPhone(input);
        System.out.println("Преобразованный ввод: " + result);
    }

    public static String convertNumpadToPhone(String input) {
        // Создаем маппинг между нумпадом и телефонной клавиатурой
        Map<Character, Character> numpadToPhoneMap = new HashMap<>();
        numpadToPhoneMap.put('1', '1');
        numpadToPhoneMap.put('2', '1');
        numpadToPhoneMap.put('3', '1');
        numpadToPhoneMap.put('4', '2');
        numpadToPhoneMap.put('5', '3');
        numpadToPhoneMap.put('6', '3');
        numpadToPhoneMap.put('7', '4');
        numpadToPhoneMap.put('8', '5');
        numpadToPhoneMap.put('9', '6');
        numpadToPhoneMap.put('0', '0');

        StringBuilder result = new StringBuilder();

        // Проходим по каждому символу во входной строке
        for (char ch : input.toCharArray()) {
            if (numpadToPhoneMap.containsKey(ch)) {
                result.append(numpadToPhoneMap.get(ch));
            } else {
                // Если символ не является цифрой, добавляем его в результат без изменений
                result.append(ch);
            }
        }

        return result.toString();
    }
}
