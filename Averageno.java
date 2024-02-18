import java.util.*;

public class Averageno {
    public static int average(int n1, int n2, int n3) {
        int avg = (n1 + n2 + n3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.s");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int average = average(a, b, c);
        System.out.println("Average of three no. is : " + average);
    }
}
