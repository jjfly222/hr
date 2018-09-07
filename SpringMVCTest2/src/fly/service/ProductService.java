package fly.service;

import java.util.List;

public interface ProductService {
	/**
	 * 查询产品名称
	 */
	public List<String> queryProduct();
	/**
	 * 查询价格，通过产品名称
	 */
	public Double queryProductByName(String prodName);
}
