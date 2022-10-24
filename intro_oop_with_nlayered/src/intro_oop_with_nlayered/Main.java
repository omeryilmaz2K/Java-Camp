package intro_oop_with_nlayered;

import java.util.Arrays;

import intro_oop_with_nlayered.business.ProductManager;
import intro_oop_with_nlayered.core.logging.DatabaseLogger;
import intro_oop_with_nlayered.core.logging.EmailLogger;
import intro_oop_with_nlayered.data_access.JdbcProductDao;
import intro_oop_with_nlayered.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(0, "iPhone XR", 15000);
		ProductManager manager = new ProductManager(new JdbcProductDao(), Arrays.asList(new DatabaseLogger(), new EmailLogger()));
		manager.add(product1);
	}

}
