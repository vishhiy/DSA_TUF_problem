package BasicMath;
import java.util.*; 
public class gcd {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    int n1=sc.nextInt(); 
    int n2=sc.nextInt(); 
    
        while(n1>0 && n2>0){
           if(n1>n2){
            n1=n1%n2;
           }else{
           n2=n2%n1;
           }
        }
        if(n1==0){
           System.out.println(n2);
        }
           else{ System.out.println(n1);}
        
    }
    
}
