package fly.service;

import fly.entity.Order;

public interface OrderService {
	/**
	 * ��������
	 */
	public void addOrder(Order order);

	/**
	 * �޸Ķ���
	 */
	public void updateOrder(Order order);

	/**
	 * ��ѯ������ͨ��id
	 */
	public Order queryOrderById(Integer odrCustmoerId);
}
