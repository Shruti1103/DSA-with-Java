import java.util.*;
public class Binomialcoefficient {
    public static int binomialcoefficient(int n,int r){
        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n-r);
        return a/(b*c);
    }
    public static int factorial(int number){
        int f =1;
        int i;
        for(i=1;i<=number;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n = sc.nextInt();
        System.out.print("Enter the value of r");
        int r = sc.nextInt();
        sc.close();
        int result = binomialcoefficient(n,r);
        System.out.print("The result is : "+result);

    }
    }

        

    