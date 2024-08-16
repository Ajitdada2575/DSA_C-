import java.util.Scanner;

public class S2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        int maxLength = 1;
        int currentLength = 1;
        
        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
        }
        
        System.out.println(maxLength);
        
        scanner.close();
    }
}
