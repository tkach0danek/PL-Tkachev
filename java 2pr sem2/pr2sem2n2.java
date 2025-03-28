import java.util.Scanner;

public class EmployeeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите данные в формате '[1, 0, 1, 1, 1]': ");
        String input = scanner.nextLine();
        
        // Удаляем квадратные скобки и разбиваем строку по запятой
        input = input.replaceAll("[\[\] ]", ""); // Убираем пробелы и скобки
        String[] parts = input.split(",");

        int employeeCount = 0;

        for (String part : parts) {
            // Преобразуем строку в число и проверяем
            if (Integer.parseInt(part) == 1) {
                employeeCount++;
            }
        }

        System.out.println("Количество сотрудников, зашедших на предприятие: " + employeeCount);
        
        scanner.close();
    }
}
