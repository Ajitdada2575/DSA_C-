import java.util.Scanner;
public class S3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();
        String[] cards = new String[5];
        for (int i = 0; i < 5; i++) {
            target.equalsIgnoreCase("ajit");
            cards[i] = sc.nextLine();
        }
        boolean found = false;
        for (String card : cards) {
            if (card.contains(Character.toString(target.charAt(0))) || 
                card.contains(Character.toString(target.charAt(1)))) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}
