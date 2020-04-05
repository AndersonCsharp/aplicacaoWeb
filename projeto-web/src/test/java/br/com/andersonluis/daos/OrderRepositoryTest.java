package br.com.andersonluis.daos;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

import br.com.andersonluis.entities.OrderEntity;
import br.com.andersonluis.utils.DaoFactory;

public class OrderRepositoryTest {

	private static final Logger LOGGER = Logger.getLogger(OrderRepositoryTest.class);

	private OrderDao orderDao = DaoFactory.orderInstance();

	@Test
	public void testFindAll() {
		List<OrderEntity> orders = this.orderDao.findAll();

		LOGGER.info(orders);
	}

}
