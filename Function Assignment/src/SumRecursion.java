//Write a recursive method to find: 1 + 2 + 3 + ... + n .
public class SumRecursion {
    static int sum(int n) {
        if (n == 1)
            return 1;

        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}