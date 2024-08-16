import java.util.Scanner;

public class s6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();  // Number of test cases
        
        for (int i = 0; i < t; i++) {
            int xc = scanner.nextInt();
            int yc = scanner.nextInt();
            int k = scanner.nextInt();
            
            for (int j = 0; j < k; j++) {
                int x = xc + j;   // Varying x-coordinate
                int y = yc - j;   // Varying y-coordinate
                
                System.out.println(x + " " + y);
            }
        }
        
        scanner.close();
    }
}

