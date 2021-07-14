package com.saran.model;
import java.time.LocalDate;
public class Export {
public int productid;
public int exportid;
public LocalDate Exportdate;
public String exportDestination;
public int exportcost;

public Export() {
	System.out.println("default constructor");
}

	public Export(int productid, int exportid, LocalDate exportdate, String exportDestination, int exportcost) {
	super();
	this.productid = productid;
	this.exportid = exportid;
	Exportdate = exportdate;
	this.exportDestination = exportDestination;
	this.exportcost = exportcost;
}

	@Override
	public String toString() {
		return "Export [productid=" + productid + ", exportid=" + exportid + ", Exportdate=" + Exportdate
				+ ", exportDestination=" + exportDestination + ", exportcost=" + exportcost + "]";
	}



	
}
