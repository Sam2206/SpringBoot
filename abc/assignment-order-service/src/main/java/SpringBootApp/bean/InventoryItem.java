package SpringBootApp.bean;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class InventoryItem 
{
	private Long id;
	private String productCode;
	private Integer availableQuantity;
	
	public InventoryItem() {}

	public InventoryItem(Long id, String productCode, Integer availableQuantity) {
		super();
		this.id = id;
		this.productCode = productCode;
		this.availableQuantity = availableQuantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	
	
	
}
