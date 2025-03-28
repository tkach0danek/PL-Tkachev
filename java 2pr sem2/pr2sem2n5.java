import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String input = scanner.nextLine(); 

        String[] numbersString = input.split(" ");
        int sumOfSquares = 0; 

        for (String numStr : numbersString) {
            try {
                int num = Integer.parseInt(numStr); 
                sumOfSquares += num * num; 
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод: " + numStr + " не является числом.");
            }
        }

        System.out.println("Сумма квадратов: " + sumOfSquares); 
        scanner.close(); 
    }
}
