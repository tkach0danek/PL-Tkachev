public class RecursiveFunction {

    public static void main(String[] args) {
        // Пример вызова функции
        int n = 10;
        System.out.println("func(" + n + ") = " + func(n));
    }

    public static int func(int n) {
        // Условие 1: func(0) = 0
        if (n == 0) {
            return 0;
        }
        // Условие 2: func(1) = 1
        else if (n == 1) {
            return 1;
        }
        // Условие 3: func(2*n) = func(n)
        else if (n % 2 == 0) {
            return func(n / 2);
        }
        // Условие 4: func(2*n + 1) = func(n) + func(n + 1)
        else {
            return func(n / 2) + func(n / 2 + 1);
        }
    }
}
