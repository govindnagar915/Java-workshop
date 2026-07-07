//WAP to find largest among three numbers using nested ?:.
public class LargestTernary {
    public static void main(String[] args) {
        int a = 15, b = 40, c = 25;

        int largest = (a > b)
                ? ((a > c) ? a : c)
                : ((b > c) ? b : c);

        System.out.println("Largest = " + largest);
    }
}
