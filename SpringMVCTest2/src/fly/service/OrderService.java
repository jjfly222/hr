package fly.service;

import fly.entity.Order;

public interface OrderService {
	/**
	 * 新增订单
	 */
	public void addOrder(Order order);

	/**
	 * 修改订单
	 */
	public void updateOrder(Order order);

	/**
	 * 查询订单，通过id
	 */
	public Order queryOrderById(Integer odrCustmoerId);
}
