//Write a method countDigits(int n) that returns the number of digits.
public class CountDigits {
    static int countDigits(int n) {
        int count = 0;

        if (n == 0)
            return 1;

        while (n != 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
    }
}