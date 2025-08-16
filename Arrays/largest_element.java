import java.util.Arrays;

public class largest_element {
    public static int MaxNum(int n[], int idx){
        if(idx==n.length){
            return 0; 
        }
        int ans=MaxNum(n, idx+1);
        return Math.max(n[idx], ans);
    }
    public static void main(String[] args) {
      int n[]={1,2,3,14,5};
      System.out.println(MaxNum(n, 0));
    }
}
