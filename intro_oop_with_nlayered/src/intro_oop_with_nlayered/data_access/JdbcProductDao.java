package intro_oop_with_nlayered.data_access;

import intro_oop_with_nlayered.entities.Product;

public class JdbcProductDao {
	
	public void add(Product product) {
		// sadece ve sadece DB erişim kodları buraya yazılır... SQL
		System.out.println("JDBC ile veri tabanına eklendi: " + product.getName());
	}
}
