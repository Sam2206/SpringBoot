package SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import SpringBootApp.bean.Product;

@Service
public class CatalogServiceImpl implements CatalogService
{

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	
	public Product getProduct(Long productId) {
		return restTemplate.getForObject("http://localhost:8090/products/"+productId, Product.class);
	}

}
