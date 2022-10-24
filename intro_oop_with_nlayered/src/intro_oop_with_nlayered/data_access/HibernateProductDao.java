package intro_oop_with_nlayered.data_access;

import intro_oop_with_nlayered.entities.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		// sadece ve sadece DB erişim kodları buraya yazılır... SQL
		System.out.println("Hibernate ile veri tabanına eklendi: " + product.getName());
	}
}
