public class prime {
    
         static boolean checkPrime(int n){ 
        int cnt = 0; 
        for(int i = 1; i <= Math.sqrt(n); i++){ 

            if(n % i == 0){ 
                cnt = cnt + 1;
                if(n / i != i){
                    cnt = cnt + 1;
                }
            }
        }
        if(cnt == 2){
            return true;
        }
        else{
            return false; 
        }
    }
    public static void main(String[] args) {
        int n = 1483;
        boolean isPrime = checkPrime(n);
        if(isPrime){
            System.out.println(n + " prime");
        } else {
            System.out.println(n + " not");
        }
    }
    }

