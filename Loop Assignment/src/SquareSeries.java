//.Print 1, 4, 9, 16, ... up to N terms.
public class SquareSeries {
    public static void main(String[] args) {
        int n = 10;

        for (int i = 1; i <= n; i++) {
            System.out.print(i * i + " ");
        }
    }
}