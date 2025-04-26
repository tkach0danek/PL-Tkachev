import java.math.BigInteger;
import java.util.Scanner;

public class StringAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ввод двух чисел в формате строки
        System.out.print("Введите первое положительное число: ");
        String num1 = scanner.nextLine();
        
        System.out.print("Введите второе положительное число: ");
        String num2 = scanner.nextLine();
        
        // Сложение чисел и вывод результата
        String result = addStrings(num1, num2);
        System.out.println("Сумма: " + result);
    }

    public static String addStrings(String num1, String num2) {
        // Используем BigInteger для сложения строковых представлений чисел
        BigInteger bigInt1 = new BigInteger(num1);
        BigInteger bigInt2 = new BigInteger(num2);
        
        // Сложение
        BigInteger sum = bigInt1.add(bigInt2);
        
        // Возвращаем результат в формате строки
        return sum.toString();
    }
}
