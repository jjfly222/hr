package fly.entity;

public class Line {
	private Integer odlId;
	private Integer odlOrderId;
	private String odlProductName;
	private Double odlProductPrice;
	private Integer odlProductCount;
	

	public Line() {
		super();
	}
	public Line(Integer odlId, Integer odlOrderId, String odlProductName, Double odlProductPrice,
			Integer odlProductCount) {
		super();
		this.odlId = odlId;
		this.odlOrderId = odlOrderId;
		this.odlProductName = odlProductName;
		this.odlProductPrice = odlProductPrice;
		this.odlProductCount = odlProductCount;
	}
	public Integer getOdlId() {
		return odlId;
	}
	public void setOdlId(Integer odlId) {
		this.odlId = odlId;
	}
	public Integer getOdlOrderId() {
		return odlOrderId;
	}
	public void setOdlOrderId(Integer odlOrderId) {
		this.odlOrderId = odlOrderId;
	}
	public String getOdlProductName() {
		return odlProductName;
	}
	public void setOdlProductName(String odlProductName) {
		this.odlProductName = odlProductName;
	}
	public Double getOdlProductPrice() {
		return odlProductPrice;
	}
	public void setOdlProductPrice(Double odlProductPrice) {
		this.odlProductPrice = odlProductPrice;
	}
	public Integer getOdlProductCount() {
		return odlProductCount;
	}
	public void setOdlProductCount(Integer odlProductCount) {
		this.odlProductCount = odlProductCount;
	}
	
}
