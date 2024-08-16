import java.util.Scanner;

public class s7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        s.toUpperCase();
        String n=sc.next();
        n.toUpperCase();
        int a=s.length();
        int c1=0,c2=0,c3=0;
	for(int i=0;i<a;i++){
	           if(s.charAt(i)==n.charAt(i)){
                     c1++;				   
	                          }
			else if(s.charAt(i)>n.charAt(i)){
				 c2++;     
			}
else{c3++;}			
	
	}
    int m=0;
	if(c1==a){m=0;}
	else if(c3>c2){m=-1;}
	else{m=1;}
	System.out.println(m);
    sc.close();
    }
}
