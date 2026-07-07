//Print first 10 terms of the arithmetic progression (AP).
public class APSeries {
    public static void main(String[] args) {
        int a = 2;
        int d = 3;

        for (int i = 0; i < 10; i++) {
            System.out.print((a + i * d) + " ");
        }
    }
}