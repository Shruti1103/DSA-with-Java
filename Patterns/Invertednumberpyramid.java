public class Invertednumberpyramid {
  public static void numberpyramid(int n) {
    int i, j;
    for (i = 1; i <= n; i++) {
      for (j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println(" ");
    }
  }

  public static void main(String[] args) {
    numberpyramid(5);
  }
}
