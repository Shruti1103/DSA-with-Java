package Patterns;
public class Floydtriangle {
    public static void floydtriangle(int n){
        int i, j;
        int counter = 1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                  System.out.print(counter + " ");
                  counter++;
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
       floydtriangle(5);
    }
    
}
