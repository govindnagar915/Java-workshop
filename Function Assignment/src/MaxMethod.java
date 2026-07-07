//Write a method max(int a, int b) that returns the greater number.
public class MaxMethod {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 20));
    }
}