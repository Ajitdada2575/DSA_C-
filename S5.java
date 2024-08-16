import java.util.Scanner;

public class S5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine(); 
        String t = scanner.nextLine();
        
        StringBuilder s = new StringBuilder();
        int index = 0;
        
        for (int i = 1; i <= n; i++) {
            if (index < t.length()) {
                s.append(t.charAt(index));
                index += i;
            } else {
                break;
            }
        }
        
        System.out.println(s.toString());
        scanner.close();
    }
}
