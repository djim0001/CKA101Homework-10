package hw5;

public abstract class Pen {
	
	private String brand;
	private double price;
	public Pen() {
		
	}
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	String getBrand() {
		return brand;
	}
	double getPrice() {
		if(price > 0) {
			return price;
		}else {
			return 0;
		}
		
	}
	abstract void write();
	
}
