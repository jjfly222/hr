package fly.dao;

import fly.entity.Order;

public interface OrderDao {
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
