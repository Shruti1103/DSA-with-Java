package Patterns;
public class Butterflypattern1 {
    public static void butterfly(int n){
        int i,j;
        for(i=1;i<=n;i++){
          //stars
          for(j=1;j<=i;j++){
              System.out.print("*");
          }
          //space
          for(j=1;j<=2*(n-i);j++){
              System.out.print(" ");
          }
          //stars
          for(j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println(" ");
        }
        // reverse loop
        for(i=n;i>=1;i--){
          //stars
          for(j=1;j<=i;j++){
              System.out.print("*");
          }
          //space
          for(j=1;j<=2*(n-i);j++){
              System.out.print(" ");
          }
          //stars
          for(j=1;j<=i;j++){
              System.out.print("*");
          }
          System.out.println(" ");
        }
  }
  public static void main (String[] args){
     butterfly(5);
  }
}

