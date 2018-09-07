package fly.entity;

public class Product {
	private Integer prodId;
	private String prodName;
	private Double proPrice;
	
	public Product() {
		super();
	}
	public Product(Integer prodId, String prodName, Double proPrice) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.proPrice = proPrice;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProPrice() {
		return proPrice;
	}
	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}
	
	
}
