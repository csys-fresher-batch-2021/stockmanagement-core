package stockmanagement;
import java.time.LocalDate;
public class Stock {

	public int ProductId;
	public String ProductName;
	public LocalDate OrderedDate;
	public int ProductQuantity;
	public Stock(){
		System.out.println("Deafault Constructor");
	}
	
	{ 

	}


	/**
	 * @param productId
	 * @param productName
	 * @param orderedDate
	 * @param productQuantity
	 */
	public Stock(int productId, String productName, LocalDate orderedDate, int productQuantity) {
		super();
		ProductId = productId;
		ProductName = productName;
		OrderedDate = orderedDate;
		ProductQuantity = productQuantity;
	}


	@Override
	public String toString() {
		return "Stock [ProductId=" + ProductId + ", ProductName=" + ProductName + ", OrderedDate=" + OrderedDate
				+ ", ProductQuantity=" + ProductQuantity + "]";
	}
	}


