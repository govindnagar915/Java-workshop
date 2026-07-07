//Electricity Bill System
class ElectricityBill {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            bill += bill * 0.10;
        }

        return bill;
    }
}

public class Electricity {
    public static void main(String[] args) {
        ElectricityBill eb = new ElectricityBill();

        eb.setCustomerName("Govind");
        eb.setUnitsConsumed(600);
        eb.setPricePerUnit(8);

        System.out.println("Customer Name : " + eb.getCustomerName());
        System.out.println("Final Bill : " + eb.getTotalBill());
    }
}