//Print the alternating series: 1, -2, 3, -4, ... up to N.
public class AlternatingSeries {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.print(-i + " ");
            else
                System.out.print(i + " ");
        }
    }
}