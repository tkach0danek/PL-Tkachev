import java.util.Scanner;

public class ClosestSquareFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        
        int inputNumber = scanner.nextInt(); 
        int closestNumber = findClosestSquare(inputNumber);
        
        System.out.println("Число, квадрат которого ближе всего к " + inputNumber + " это: " + closestNumber);
        
        scanner.close(); 
    }
    
    
    public static int findClosestSquare(int target) {
        int closestNum = 0;
        int minDifference = Integer.MAX_VALUE; 
        
        
        for (int i = 0; i <= Math.sqrt(target) + 1; i++) {
            int square = i * i; 
            
            
            int difference = Math.abs(square - target);
            
            
            if (difference < minDifference) {
                minDifference = difference;
                closestNum = i;
            }
        }
        
        return closestNum; 
    }
}
