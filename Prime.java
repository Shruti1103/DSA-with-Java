public class Prime {
    public static boolean isPrime (int n){
        boolean isprime = true;
        int i;
        for(i=2;i<=n/2;i++){
            if(n % i ==0){
            isprime = false;
            break;
            }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(5));
    }
    
}
