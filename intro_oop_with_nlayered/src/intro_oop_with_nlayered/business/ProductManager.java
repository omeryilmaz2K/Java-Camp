package intro_oop_with_nlayered.business;

import intro_oop_with_nlayered.data_access.ProductDao;
import intro_oop_with_nlayered.entities.Product;

public class ProductManager {
	// Loosely Coupling
	private ProductDao productDao;
	
	// Dependency Injection
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	// Parametreden alınan bu varlık nesnesi response - request pattern ile yeniden ele alınacak!
	public void add(Product product) throws Exception { 
		// İş kuralları - business rule
		if (product.getUnitPrice() < 1) {
			throw new Exception("Ürün fiyatı 1 liradan az olamaz!");
		}
		// Bir katman, başka bir katmanın class'ını kullanırken sadece Interface'inden erişim kurmalıdır!
		// ProductDao productDao = new HibernateProductDao();
		productDao.add(product);
	}
}
