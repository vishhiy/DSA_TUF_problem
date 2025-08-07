package BasicMath;
import java.util.*;
public class armstrong {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int n = sc.nextInt(); 
       int ld=0; 
       int ans=0;
       int org=n;
      while(n>0){
        ld=n%10; 
        ans+=ld*ld*ld; 
        n/=10; 
       } 
       if(ans==org){
        System.out.println("armstrong");
       }else{
        System.out.println("not");
       }
    }
}
