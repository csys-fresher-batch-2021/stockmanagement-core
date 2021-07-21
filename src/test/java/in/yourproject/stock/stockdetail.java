package in.yourproject.stock;
import java.sql.Date;
import java.time.LocalDate;
public class stockdetail {

	public int ProductId;
	public String ProductName;
	public Date OrderedDate;
public int ProductQuantity;
public stockdetail(){
	
}
public stockdetail(int productId, String productName, Date orderedDate, int productQuantity) {
	super();
	ProductId = productId;
	ProductName = productName;
	OrderedDate = orderedDate;
	ProductQuantity = productQuantity;
}
@Override
public String toString() {
	return "stockdetail [ProductId=" + ProductId + ", ProductName=" + ProductName + ", OrderedDate=" + OrderedDate
			+ ", ProductQuantity=" + ProductQuantity + "]";
}
public int getProductId() {
	return ProductId;
}
public void setProductId(int productId) {
	ProductId = productId;
}
public String getProductName() {
	return ProductName;
}
public void setProductName(String productName) {
	ProductName = productName;
}
public Date getOrderedDate() {
	return OrderedDate;
}
public void setOrderedDate(Date orderDate) {
	OrderedDate = orderDate;
}
public int getProductQuantity() {
	return ProductQuantity;
}
public void setProductQuantity(int productQuantity) {
	ProductQuantity = productQuantity;
} 

}
