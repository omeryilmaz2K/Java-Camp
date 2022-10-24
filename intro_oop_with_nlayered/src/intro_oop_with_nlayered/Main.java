package intro_oop_with_nlayered;

import intro_oop_with_nlayered.business.ProductManager;
import intro_oop_with_nlayered.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(0, "iPhone XR", 15000);
		ProductManager manager = new ProductManager();
		manager.add(product1);
	}

}
