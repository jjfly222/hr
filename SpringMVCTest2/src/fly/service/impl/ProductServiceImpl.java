package fly.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import fly.dao.ProductDao;
import fly.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	
	private  ProductDao productDao;
	
	@Override
	public List<String> queryProduct() {
		return productDao.queryProduct();
	}

	@Override
	public Double queryProductByName(String prodName) {
		return productDao.queryProductByName(prodName);
	}

}
