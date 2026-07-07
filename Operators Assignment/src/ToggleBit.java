//WAP to toggle a specific bit (e.g., 3rd bit) of a number.
public class ToggleBit {
    public static void main(String[] args) {
        int n = 10; // 1010

        int result = n ^ (1 << 2); // Toggle 3rd bit

        System.out.println("Original Number = " + n);
        System.out.println("After Toggle = " + result);
    }
}