import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] original = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                original[i][j] = scanner.nextInt();
            }
        }
        
        int[][] rotated = new int[cols][rows];
        
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                rotated[i][j] = original[rows - 1 - j][i];
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
            
            /*
            11 12 13 14
            21 22 23 24
            31 32 33 34
            
            31 21 11
            32 22 12
            33 23 13
            34 24 14
             */
        }
    }
}