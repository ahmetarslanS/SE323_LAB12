import java.util.ArrayList;
import java.util.List;

public class Market {

    private String name;
    private List<HouseholdItems> catalog;

    public Market(String name) {
        this.name = name;
        this.catalog = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void addItem(HouseholdItems item) {
        catalog.add(item);
    }

    public void removeItem(HouseholdItems item) {
        catalog.remove(item);
    }

    public HouseholdItems search(String itemName, char searchType) {
        for (HouseholdItems item : catalog) {
            if (item.getName().equals(itemName)) {
                if (searchType == 'm' && item instanceof Furniture) {
                    return item;
                } else if (searchType == 'e' && item instanceof Appliances) {
                    return item;
                }
            }
        }
        return null;
    }

    public HouseholdItems list(char searchType) {
        int index = 1;
        List<HouseholdItems> items = new ArrayList<>();
        for(HouseholdItems item : catalog){
            if (searchType == 'm' && item instanceof Furniture){
                items.add(item);
                System.out.println(index + " . " + item.getName());
                index ++;
            }else if (searchType == 'e' && item instanceof Appliances){
                items.add(item);
                System.out.println(index + " . "+ item.getName());
                index ++;
            }

        }
        return null;
    }
}
