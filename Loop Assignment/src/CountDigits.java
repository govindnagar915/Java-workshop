//Count number of digits in a given number.
public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;

        if (n == 0)
            count = 1;
        else {
            while (n != 0) {
                count++;
                n /= 10;
            }
        }

        System.out.println("Digits = " + count);
    }
}