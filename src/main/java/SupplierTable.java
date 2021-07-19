package in.chainsys.model;

public class SupplierTable {
	private  int supplierId;
	private String supplierName;
	private String supplierCompany;
	private String supplierEmail;
	private Long supplierPhno;
	public int getSupplierId() {
		return supplierId;
	}
	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierCompany() {
		return supplierCompany;
	}
	public void setSupplierCompany(String supplierCompany) {
		this.supplierCompany = supplierCompany;
	}
	public String getSupplierEmail() {
		return supplierEmail;
	}
	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
	public Long getSupplierPhno() {
		return supplierPhno;
	}
	public void setSupplierPhno(Long supplierPhno) {
		this.supplierPhno = supplierPhno;
	}
	public SupplierTable(int supplierId, String supplierName, String supplierCompany, String supplierEmail,
			Long supplierPhno) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierCompany = supplierCompany;
		this.supplierEmail = supplierEmail;
		this.supplierPhno = supplierPhno;
	}
	@Override
	public String toString() {
		return "SupplierTable [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierCompany="
				+ supplierCompany + ", supplierEmail=" + supplierEmail + ", supplierPhno=" + supplierPhno + "]";
	}
	


}
