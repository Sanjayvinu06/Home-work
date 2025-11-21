class FoodItem {
    private String name;
    private int productId;
    private double amount;

    // Constructor
    public FoodItem(String name, int productId, double amount) {
        this.name = name;
        this.productId = productId;
        this.amount = amount;
    }

    // Display Method
    public void display() {
        System.out.println("FOOD ITEM :: " + name);
        System.out.println("PRODUCT ID :: " + productId);
        System.out.println("PRODUCT AMOUNT :: " + amount);
        System.out.println("----------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Storing elements using objects
        FoodItem f1 = new FoodItem("IDLY", 1, 8);
        FoodItem f2 = new FoodItem("POORI", 2, 30);
        FoodItem f3 = new FoodItem("DOSA", 3, 25);

        // Printing using display() method
        f1.display();
        f2.display();
        f3.display();
    }
}
