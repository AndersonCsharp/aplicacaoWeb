package br.com.andersonluis.daos;

import java.util.List;

import br.com.andersonluis.entities.CategoryEntity;
import br.com.andersonluis.utils.GenericDao;

public class CategoryDao extends GenericDao<CategoryEntity, Long> {

	@SuppressWarnings("unchecked")
	public List<CategoryEntity> findByCategoryName(String categoryName) {
		List<CategoryEntity> categories = (List<CategoryEntity>)
				this.executeQuery("SELECT c FROM CategoryEntity c WHERE c.categoryName = ?0", categoryName);

		return categories;
	}

}
