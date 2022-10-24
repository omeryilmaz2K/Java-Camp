package intro_oop_with_nlayered.business;

import intro_oop_with_nlayered.data_access.JdbcProductDao;
import intro_oop_with_nlayered.entities.Product;

public class ProductManager {
	
	// Parametreden alınan bu varlık nesnesi response - request pattern ile yeniden ele alınacak!
	public void add(Product product) throws Exception { 
		// İş kuralları - business rule
		if (product.getUnitPrice() < 1) {
			throw new Exception("Ürün fiyatı 1 liradan az olamaz!");
		}
		JdbcProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	}
}
