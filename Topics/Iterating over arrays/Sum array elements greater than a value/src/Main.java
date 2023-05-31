import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int arraySize = scanner.nextInt();
        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = scanner.nextInt();
        }
        
        int greaterThan = scanner.nextInt();
        for (int i = 0; i < arraySize; i++) {
            if (intArray[i] > greaterThan) {
                sum += intArray[i];
            }
        }
        System.out.println(sum);
    }
}