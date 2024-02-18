public class ButterflyPattern {
    public static void butterfly(int n){
          int i,j;
          for(i=1;i<=4;i++){
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(j=1;j<=n-2*i;j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
          }
          // reverse loop
          for(i=4;i>=1;i--){
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //space
            for(j=1;j<=n-2*i;j++){
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
       butterfly(8);
    }
}
