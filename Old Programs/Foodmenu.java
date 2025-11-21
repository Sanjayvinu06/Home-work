class Foodmenu 

    {
	
		private String name;
		private int productId;
		private double amount;

		{
		 public FoodItem(String name, int productId, double amount) {
			this.name = name;
			this.productId = productId;
			this.amount = amount;
		}

		public void display() {
			System.out.println("FOOD ITEM :: " + name);
			System.out.println("PRODUCT ID :: " + productId);
			System.out.println("PRODUCT AMOUNT :: " + amount);
			System.out.println("---------------------------------");
		}
	}

	public class Main 
	   {
		 public static void main(String[] args) {

		   
			FoodItem f1 = new FoodItem("TEA", 1, 15);
			FoodItem f2 = new FoodItem("COFFEE", 2, 20);
			FoodItem f3 = new FoodItem("BLACK COFFEE", 3, 25);

		   
			f1.display();
			f2.display();
			f3.display();
		}
	}
