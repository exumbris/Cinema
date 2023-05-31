import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long num1 = scanner.nextLong();
        char operation = scanner.next().charAt(0);
        long num2 = scanner.nextLong();
        
        switch (operation) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '/':
                System.out.println(num2 == 0 ? "Division by 0!" : num1 / num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Unknown operator");
                break;
            
        }
    }
}