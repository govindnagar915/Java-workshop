//Write a method isArmstrong(int n) that checks whether a number is an Armstrong number.
public class ArmstrongMethod {
    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (temp != 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}