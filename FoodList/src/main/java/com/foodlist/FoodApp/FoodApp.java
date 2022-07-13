package com.foodlist.FoodApp;

public class FoodApp 
{
	private long menuItem;
	private String itemname;
	private String status;
	private double price;
	private String category;
	
	
	public FoodApp(long menuItem, String itemname, String status, double price, String category) {
		super();
		this.menuItem = menuItem;
		this.itemname = itemname;
		this.status = status;
		this.price = price;
		this.category = category;
	}
	@Override
	public String toString() {
		return "FoodApp [menuItem=" + menuItem + ", itemname=" + itemname + ", status=" + status + ", price=" + price
				+ ", category=" + category + "]";
	}
	public long getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(long menuItem) {
		this.menuItem = menuItem;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}

