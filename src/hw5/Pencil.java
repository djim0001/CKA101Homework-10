package hw5;

public class Pencil extends Pen{
	public Pencil() {
		super();
	}
	public Pencil(String brand, double price) {
		super(brand, price * 0.8);
	}
	void write() {
		System.out.println("削鉛筆再寫");
	}
	
	
}
