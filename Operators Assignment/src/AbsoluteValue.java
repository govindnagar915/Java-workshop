//WAP to find the absolute value of a number using the ternary operator.

public class AbsoluteValue {
    public static void main(String[] args) {
        int n = -24;

        int abs = (n < 0) ? -n : n;

        System.out.println("Absolute Value = " + abs);
    }
}