package BasicMath; 
import java.util.*; 
public class countDigit {
public static void main(String[] args) {
int count=0; 
Scanner sc=new Scanner(System.in); 
int n = sc.nextInt();
int c=0;  
while(n>0){
int ld=n%10; 
n/=10; 
c++; 
}
System.out.println(c);
}
}