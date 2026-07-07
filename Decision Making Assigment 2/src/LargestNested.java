//WAP to find the largest among three numbers using nested if.
public class LargestNested {
    public static void main(String[] args) {
        int a = 15, b = 40, c = 25;

        if (a > b) {
            if (a > c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b > c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}