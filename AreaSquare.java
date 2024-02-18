import java.util.*;

public class AreaSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        double area = side * side;
        sc.close();
        System.out.println(area);

    }
}
