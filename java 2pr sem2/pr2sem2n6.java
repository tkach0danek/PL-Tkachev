import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для проверки: ");
        
        int number = scanner.nextInt(); 
        
        if (isPrime(number)) {
            System.out.println(number + " является простым числом.");
        } else {
            System.out.println(number + " не является простым числом.");
        }
        
        scanner.close(); 
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;
            }
        }
        return true; 
    }
}
