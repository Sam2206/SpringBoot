package SpringBootApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import SpringBootApp.bean.InventoryItem;

@Service
public class InventoryServiceImpl implements InventoryService
{

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public InventoryItem getInventoryItemByProductCode(String productCode) {
		return restTemplate.getForObject("http://localhost:8091/code/"+productCode, InventoryItem.class);
	}

}
