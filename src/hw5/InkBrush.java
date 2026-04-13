package hw5;

public class InkBrush extends Pen{
	public InkBrush() {
		super();
	}
	public InkBrush(String brand, double price) {
		super(brand, price * 0.9);
	}

	void write() {
		System.out.println("沾墨汁再寫");
	}
}
