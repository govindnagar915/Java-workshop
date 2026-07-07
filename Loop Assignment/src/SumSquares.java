//Print the sum of squares of first N natural numbers.
public class SumSquares {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }

        System.out.println("Sum = " + sum);
    }
}