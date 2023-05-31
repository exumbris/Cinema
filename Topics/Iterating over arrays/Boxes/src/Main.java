import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        /*
        137
        238
        
        
        249
        138
         */
        Scanner scanner = new Scanner(System.in);
        int arraySize = 3;
        int[] box1 = new int[arraySize];
        int[] box2 = new int[arraySize];
        
        for (int i = 0; i < arraySize; i++) {
            box1[i] = scanner.nextInt();
        }
        for (int i = 0; i < arraySize; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        Arrays.sort(box2);
        
        
        int bigger = 0;
        for (int i = 0; i < arraySize; i++) {
            bigger = box1[i] > box2[i] ? bigger + 1 : box1[i] < box2[i] ? bigger - 1 : bigger;
        }
        if (bigger == 3) {
            System.out.println("Box 1 > Box 2");
        } else if (bigger == -3) {
            System.out.println("Box 1 < Box 2");
        } else {
            System.out.println("Incompatible");
        }
    }
}
// 1 3 7
// 2 3 8