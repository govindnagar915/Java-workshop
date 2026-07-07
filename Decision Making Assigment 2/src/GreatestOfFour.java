//WAP to find the greatest of four numbers.(using nested)
public class GreatestOfFour {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30, d = 40;

        if (a > b) {
            if (a > c) {
                if (a > d)
                    System.out.println(a);
                else
                    System.out.println(d);
            } else {
                if (c > d)
                    System.out.println(c);
                else
                    System.out.println(d);
            }
        } else {
            if (b > c) {
                if (b > d)
                    System.out.println(b);
                else
                    System.out.println(d);
            } else {
                if (c > d)
                    System.out.println(c);
                else
                    System.out.println(d);
            }
        }
    }
}