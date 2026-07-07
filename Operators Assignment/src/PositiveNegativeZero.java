//Given an integer, print "Positive", "Negative" or "Zero" using nested ternary.
public class PositiveNegativeZero {
    public static void main(String[] args) {
        int n = -5;

        String result = (n > 0) ? "Positive"
                        : (n < 0) ? "Negative"
                        : "Zero";

        System.out.println(result);
    }
}