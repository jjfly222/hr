package fly.service;

import java.util.List;

public interface ProductService {
	/**
	 * ��ѯ��Ʒ����
	 */
	public List<String> queryProduct();
	/**
	 * ��ѯ�۸�ͨ����Ʒ����
	 */
	public Double queryProductByName(String prodName);
}
