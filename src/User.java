import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private String cardNumber;
    private String address;
    private List<HouseholdItems> shoppingCart;

    public User(String name, String cardNumber, String address) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.address = address;
        this.shoppingCart = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void connect(Market market) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to " + market.getName() + "! What do you want to do?");
            System.out.println("1.Search for an item");
            System.out.println("2.List items of specific type");
            System.out.println("3.Checkout");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 1) {
                System.out.println("Enter the name of the item you want to search for: ");
                String itemName = input.nextLine();
                System.out.println("Enter 'm' to search for material or 'e' for energy rating: ");
                char searchType = input.nextLine().charAt(0);
                HouseholdItems item = market.search(itemName, searchType);
                if(item != null){
                    System.out.println("Item found! Do you want to add it to your shopping cart?");
                    char addToCart = input.nextLine().charAt(0);
                    if(addToCart == 'y'){
                        shoppingCart.add(item);
                        System.out.println("Item added to shopping cart.");
                    }

                    }else {
                        System.out.println("Item not found");
                }
            }else if(choice == 2){
                System.out.println("Enter 'm' to list items by material or 'e' to list items by energy rating: ");
                char searchType = input.nextLine().charAt(0);
                HouseholdItems item = market.list(searchType);
                if(item != null){
                    System.out.println("Item found! Do you want to  add it to your shopping cart? (y/n)");
                    char addToCart = input.nextLine().charAt(0);
                    if(addToCart == 'y'){
                        shoppingCart.add(item);
                        System.out.println("Item added to shopping cart.");
                    }
                }
            }else if(choice == 3){
                break;
            }else{
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }
    public void calculate(){
        double totalPrice = 0;
        for(HouseholdItems item : shoppingCart){
            totalPrice = totalPrice + item.getPrice();
        }
        System.out.println("Total price: " + totalPrice);
    }


}
