package fly.dao;

import java.util.List;

public interface ProductDao {
	/**
	 * ��ѯ��Ʒ����
	 */
	public List<String> queryProduct();
	/**
	 * ��ѯ�۸�ͨ����Ʒ����
	 */
	public Double queryProductByName(String prodName);
}
