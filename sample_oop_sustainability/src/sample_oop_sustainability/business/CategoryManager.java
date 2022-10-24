package sample_oop_sustainability.business;

import java.util.List;

import sample_oop_sustainability.core.logging.Logger;
import sample_oop_sustainability.entities.Category;

public class CategoryManager {
	private List<Category> categories;
	private Logger logger;
	
	public CategoryManager(List<Category> categories, Logger logger) {
		this.categories = categories;
		this.logger = logger;
	}

	public void addCategory(Category category) throws Exception {
		for (Category c : categories)
			if (c.getName() == category.getName())
				throw new Exception("Kategori ismi tekrar edemez!");
		categories.add(category);
		System.out.println("Kategori başarıyla eklendi: " + category.getName());
		logger.log(category.getName());
	}
}
