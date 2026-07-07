//WAP using switch to calculate area (circle, square, rectangle, triangle).
public class AreaSwitch {
    public static void main(String[] args) {
        int choice = 1;

        switch(choice) {
            case 1:
                double r = 5;
                System.out.println(Math.PI * r * r);
                break;

            case 2:
                int side = 4;
                System.out.println(side * side);
                break;

            case 3:
                int l = 5, b = 3;
                System.out.println(l * b);
                break;

            case 4:
                int base = 6, height = 4;
                System.out.println(0.5 * base * height);
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}