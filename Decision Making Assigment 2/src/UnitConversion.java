//WAP using switch to convert units (km to m, m to cm, etc.)
public class UnitConversion {
    public static void main(String[] args) {
        int choice = 1;
        double value = 5;

        switch(choice) {
            case 1:
                System.out.println(value + " km = " + (value * 1000) + " m");
                break;

            case 2:
                System.out.println(value + " m = " + (value * 100) + " cm");
                break;

            case 3:
                System.out.println(value + " cm = " + (value * 10) + " mm");
                break;

            default:
                System.out.println("Invalid Choice");
        }
    }
}
