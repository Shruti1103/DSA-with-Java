import java.util.*;
public class Factorial {
    public static int factorial(int n){
        int f=1;
        int i;
        
        for(i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        sc.close();
        int fact =factorial(n);
        System.out.println("Factorial is :" +fact);
    
    }
}
