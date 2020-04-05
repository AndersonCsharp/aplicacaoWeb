package br.com.andersonluis.daos;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.andersonluis.entities.ProductEntity;
import br.com.andersonluis.utils.DaoFactory;

public class ProductRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(ProductRepositoryTest.class);

	private ProductDao productDao = DaoFactory.productInstance();

	@Test
	public void testFindAll() {
		List<ProductEntity> products = this.productDao.findAll();

		LOGGER.info(products);
	}

}
