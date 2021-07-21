package com.saran.model;

import java.time.LocalDate;

public class Export_Details {
	public int product_id;
	public int export_id;
	public LocalDate Export_date;
	public String export_Destination;
	public int export_cost;

	public Export_Details() {
		System.out.println("default constructor");
	}

	public Export_Details(int product_id, int export_id, LocalDate export_date, String export_Destination,
			int export_cost) {
		super();
		this.product_id = product_id;
		this.export_id = export_id;
		Export_date = export_date;
		this.export_Destination = export_Destination;
		this.export_cost = export_cost;
	}

	@Override
	public String toString() {
		return "Export_Details [product_id=" + product_id + ", export_id=" + export_id + ", Export_date=" + Export_date
				+ ", export_Destination=" + export_Destination + ", export_cost=" + export_cost + "]";
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getExport_id() {
		return export_id;
	}

	public void setExport_id(int export_id) {
		this.export_id = export_id;
	}

	public LocalDate getExport_date() {
		return Export_date;
	}

	public void setExport_date(LocalDate export_date) {
		Export_date = export_date;
	}

	public String getExport_Destination() {
		return export_Destination;
	}

	public void setExport_Destination(String export_Destination) {
		this.export_Destination = export_Destination;
	}

	public int getExport_cost() {
		return export_cost;
	}

	public void setExport_cost(int export_cost) {
		this.export_cost = export_cost;
	}

	
}
	