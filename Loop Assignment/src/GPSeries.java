//Print first 10 terms of the geometric progression (GP).
public class GPSeries {
    public static void main(String[] args) {
        int a = 2;
        int r = 3;
        int term = a;

        for (int i = 1; i <= 10; i++) {
            System.out.print(term + " ");
            term *= r;
        }
    }
}