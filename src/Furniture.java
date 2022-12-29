public class Furniture extends HouseholdItems{

    private String material;

    public Furniture(String name, double price, String material){
        super(name, price);
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

}
