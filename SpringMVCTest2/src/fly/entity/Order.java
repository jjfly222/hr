package fly.entity;

import java.util.Date;

public class Order {
		private Integer odrId;
		private Integer odrCustmoerId;
		private String odrCustomerName;
		private String odrCustomerAddr;
		private Date odrOrderDate;
		private Date odrDeliverDate;
		private String odrStatus;
		
		public Order() {
			super();
		}
		public Order(Integer odrId, Integer odrCustmoerId, String odrCustomerName, String odrCustomerAddr,
				Date odrOrderDate, Date odrDeliverDate, String odrStatus) {
			super();
			this.odrId = odrId;
			this.odrCustmoerId = odrCustmoerId;
			this.odrCustomerName = odrCustomerName;
			this.odrCustomerAddr = odrCustomerAddr;
			this.odrOrderDate = odrOrderDate;
			this.odrDeliverDate = odrDeliverDate;
			this.odrStatus = odrStatus;
		}
		public Integer getOdrId() {
			return odrId;
		}
		public void setOdrId(Integer odrId) {
			this.odrId = odrId;
		}
		public Integer getOdrCustmoerId() {
			return odrCustmoerId;
		}
		public void setOdrCustmoerId(Integer odrCustmoerId) {
			this.odrCustmoerId = odrCustmoerId;
		}
		public String getOdrCustomerName() {
			return odrCustomerName;
		}
		public void setOdrCustomerName(String odrCustomerName) {
			this.odrCustomerName = odrCustomerName;
		}
		public String getOdrCustomerAddr() {
			return odrCustomerAddr;
		}
		public void setOdrCustomerAddr(String odrCustomerAddr) {
			this.odrCustomerAddr = odrCustomerAddr;
		}
		public Date getOdrOrderDate() {
			return odrOrderDate;
		}
		public void setOdrOrderDate(Date odrOrderDate) {
			this.odrOrderDate = odrOrderDate;
		}
		public Date getOdrDeliverDate() {
			return odrDeliverDate;
		}
		public void setOdrDeliverDate(Date odrDeliverDate) {
			this.odrDeliverDate = odrDeliverDate;
		}
		public String getOdrStatus() {
			return odrStatus;
		}
		public void setOdrStatus(String odrStatus) {
			this.odrStatus = odrStatus;
		}
		@Override
		public String toString() {
			return "Order [odrId=" + odrId + ", odrCustmoerId=" + odrCustmoerId + ", odrCustomerName=" + odrCustomerName
					+ ", odrCustomerAddr=" + odrCustomerAddr + ", odrOrderDate=" + odrOrderDate + ", odrDeliverDate="
					+ odrDeliverDate + ", odrStatus=" + odrStatus + "]";
		}
		
}
