import java.util.*;


public class DominoPiling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println(getPossibleCount(m, n));
    }

    public static int getPossibleCount(int m, int n) {
        int totalArea = m*n;

        return totalArea/2;
    }
}
