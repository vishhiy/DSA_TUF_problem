package BasicMath;
import java.util.*; 
public class palindrome {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in); 
      int n= sc.nextInt(); 
        int rev=0; 
        int org=n;
       
        while(n>0){
            int ld=n%10;
            rev=(rev*10)+ld; 
            n/=10; 
        }
        if(rev==org){
            System.out.println("Palindrome");
        } else{
            System.out.println("not palindrome");
        }
    }
}
