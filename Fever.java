import java.util.*;
public class Fever {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp:");
        double temp = sc.nextDouble();
        sc.close();
        if(temp>100){
            System.out.print("You have fever"); 
        }
        else{
             System.out.print("You don't have fever");
        }

    }
}
