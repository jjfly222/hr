package fly.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fly.dao.OrderDao;
import fly.entity.Order;
import fly.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderDao orderDao;
	@Override
	public void addOrder(Order order) {
		orderDao.addOrder(order);
	}

	@Override
	public void updateOrder(Order order) {
		orderDao.updateOrder(order);
	}

	@Override
	public Order queryOrderById(Integer odr_id) {
		return orderDao.queryOrderById(odr_id);
	}

}
