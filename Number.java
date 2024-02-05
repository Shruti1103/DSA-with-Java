import java.util.*;
public class Number {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    sc.close();
    System.out.println("Enter the no.");
    
    if(number>0){
        System.out.println("Number is positive");
    }
    else if (number <0){
        System.out.print("Number is negative");

    }
    else{
        System.out.print("Number is : 0");
    }

  
    }
    
}
