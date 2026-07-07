//Rotate bits left / right .
public class LeftRotateBits {
    public static void main(String[] args) {
        int n = 5; // 00000101
        int pos = 2;

        int result = (n << pos) | (n >>> (32 - pos));

        System.out.println("Left Rotated Value = " + result);
    }
}
