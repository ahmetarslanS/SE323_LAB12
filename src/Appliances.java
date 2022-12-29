public class Appliances extends HouseholdItems {

    private char energyRating;

    public Appliances(String name, double price, char energyRating) {
        super(name, price);
        this.energyRating = energyRating;

    }
    public char getEnergyRating(){
        return energyRating;
    }

}
