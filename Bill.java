import java.util.*;
public class Bill {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        float a = sc.nextFloat(); // cost of pen
        float b = sc.nextFloat(); // cost of pencil
        float c = sc.nextFloat(); // cost of eraser
        sc.close();
        float sum = a+b+c;
        float bill = (0.18f *sum) + sum;
        System.out.print(" Total bill is : " + bill);



        }
    }
    

