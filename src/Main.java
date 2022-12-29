public class Main {
    public static void main(String[] args) {

        Appliances refrigerator = new Appliances("Refrigerator", 500, 'A');
        Appliances dishwasher = new Appliances("Dishwasher", 400, 'B');
        Appliances washingMachine = new Appliances("Washing Machine", 350, 'A');
        Furniture couch = new Furniture("Couch", 250, "Leather");
        Furniture table = new Furniture("Table", 150, "Wood");
        Furniture chair = new Furniture("Chair", 100, "Plastic");

        Market market = new Market("Furniture & Appliances");
        market.addItem(refrigerator);
        market.addItem(dishwasher);
        market.addItem(washingMachine);
        market.addItem(couch);
        market.addItem(table);
        market.addItem(chair);

        User user = new User("Ahmet", "1234567890", "123 Main St");
        user.connect(market);
        user.calculate();
    }
}