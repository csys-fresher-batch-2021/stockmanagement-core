package in.yourproject.stock;
import java.time.LocalDate;
public class stockdetail {

	public int ProductId;
	public String ProductName;
	public LocalDate OrderedDate;
public int ProductQuantity;
public stockdetail(){
	System.out.println("Deafault Constructor");
}
public stockdetail(int productId, String productName, LocalDate orderedDate, int productQuantity) {
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

}
