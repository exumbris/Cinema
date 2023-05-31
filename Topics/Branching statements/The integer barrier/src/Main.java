import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        boolean flag = false;
        while (!flag) {
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println(sum);
                flag = true;
            }
            sum += input;
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                flag = true;
            }
        }
    }
}