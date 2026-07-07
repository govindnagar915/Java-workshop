//Print whether a number is palindrome or not. 9. Print whether a number is Armstrong or not.
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121;
        int temp = n;
        int rev = 0;

        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}