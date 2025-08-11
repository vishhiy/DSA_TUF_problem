package recursion;

public class printNum {
    public static void print(int n){
        if(n==0) return; 
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        print(3);
    }
}
