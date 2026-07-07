//Print the pattern of 1/2 + 2/3 + 3/4 + ... up to N terms.
public class FractionSeries {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (double)i / (i + 1);
            System.out.print(i + "/" + (i + 1));

            if (i < n)
                System.out.print(" + ");
        }

        System.out.println("\nSum = " + sum);
    }
}