package com.venkat.model;
import java.time.LocalDate;
public class Import {
public int Productid;
public int Importid;
public LocalDate ImportDate;
public String ImportDestination;
public int Importcost;

public Import() {
	System.out.println("Default Constructor");}








/**
 * @param productid
 * @param importid
 * @param importDate
 * @param importDestination
 * @param importcost
 */
public Import(int productid, int importid, LocalDate importDate, String importDestination, int importcost) {
	super();
	Productid = productid;
	Importid = importid;
	ImportDate = importDate;
	ImportDestination = importDestination;
	Importcost = importcost;
}
@Override
public String toString() {
	return "Import [Productid=" + Productid + ", Importid=" + Importid + ", ImportDate=" + ImportDate
			+ ", ImportDestination=" + ImportDestination + ", Importcost=" + Importcost + "]";
}

}