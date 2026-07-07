//Print Floyd’s triangle (1,2,3,4,...). 28.Print Pascal’s triangle (only first 5 rows).
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int num = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}