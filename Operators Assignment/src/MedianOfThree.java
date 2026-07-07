  //Given three integers a, b, c, return the median of them using conditional / ternary expressions only.
public class MedianOfThree {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 15;

        int median = (a > b)
                ? ((b > c) ? b : (a > c ? c : a))
                : ((a > c) ? a : (b > c ? c : b));

        System.out.println("Median = " + median);
    }
}