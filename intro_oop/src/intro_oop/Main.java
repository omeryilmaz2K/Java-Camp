package intro_oop;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(0, "Asus ROG Strix G15", "16 GB RAM", 20000, 10);
		System.out.println(product1.getUnitPrice());
		System.out.println(product1.getDiscountedPrice());
	}
}
