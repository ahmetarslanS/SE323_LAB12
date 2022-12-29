public abstract class HouseholdItems {

    private String name;
    private double price;

    public HouseholdItems(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
