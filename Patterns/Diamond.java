public class Diamond {
    public static void diamond(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {

            // space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // star
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        // repeated loop in reverse direction
        for (i = n; i >= 1; i--) {

            // space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // star
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        diamond(4);
    }
}
