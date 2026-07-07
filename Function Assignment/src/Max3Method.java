//Write a method max3(int a, int b, int c) that returns the largest number.
public class Max3Method {
    static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println(max3(10, 50, 30));
    }
}
