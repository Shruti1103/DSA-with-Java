import java.util.*;
public class Solidrhombus {
 public static void rhombus(int n){
int i,j;
for(i=1;i<=n;i++){
    for(j=1;j<=n-i;j++){
        System.out.print(" ");
    }
    for(j=1;j<=n;j++){
        System.out.print("*");
    }

System.out.println();
}
 }  
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the no. of rows");
  int no = sc.nextInt();
  sc.close();
  rhombus(no);
 } 
}
