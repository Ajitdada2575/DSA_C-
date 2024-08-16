import java.util.Scanner;

public class S4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1,i=1,c=1,d=0;
        while(c<=n){
             i++;
             count+=i;
             c+=count;
             d++;
        }
System.out.println(d);
        sc.close();
    }
}



