//Count number of even and odd digits in a number.
public class EvenOddDigits {
    public static void main(String[] args) {
        int n = 123456;
        int even = 0, odd = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            n /= 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }
}