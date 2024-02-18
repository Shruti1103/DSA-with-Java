public class Primerange {
    public static void Primesinrange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        // System.out.println();
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        boolean isprime = true;
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        return isprime;
    }

    public static void main(String[] args) {
        Primesinrange(20);

    }

}
