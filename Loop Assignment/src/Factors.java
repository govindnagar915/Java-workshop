//Print all factors of a number.
public class Factors {
    public static void main(String[] args) {
        int n = 24;

        System.out.println("Factors are:");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
    }
}