package in.yourproject;

public class Customers {
	
	public int ProductId;
	public int CustomerId;
	public String CustomerName;
	public String CustomerCity;
	public String CustomerProduct;
	public int CustomerPrice;
	public int CustomerQuantity;

	public Customers() {
		System.out.println("Default Constructor");
	}

	public Customers(int productId, int customerId, String customerName, String customerCity, String customerProduct,
			int customerPrice, int customerQuantity) {
		super();
		ProductId = productId;
		CustomerId = customerId;
		CustomerName = customerName;
		CustomerCity = customerCity;
		CustomerProduct = customerProduct;
		CustomerPrice = customerPrice;
		CustomerQuantity = customerQuantity;
	}

	@Override
	public String toString() {
		return "Customers [ProductId=" + ProductId + ", CustomerId=" + CustomerId + ", CustomerName=" + CustomerName
				+ ", CustomerCity=" + CustomerCity + ", CustomerProduct=" + CustomerProduct + ", CustomerPrice="
				+ CustomerPrice + ", CustomerQuantity=" + CustomerQuantity + "]";
	}


	}


