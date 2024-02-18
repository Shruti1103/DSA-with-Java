public class Numberpyramid {
    public static void nopyramid(int n) {
        int i, j,k;
        for (i = 1; i <= n; i++) {
            // space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nopyramid(5);
    }
}
