import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long product = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            product *= i;
            // 5 * 4 * 3 * 2 * 1
        }
        return product;
        /*

        1 * 1 = 1

         */
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}