package hw5;

public class MyRectangleMain {
	
	public static void main(String[] args) {
	
		MyRectangle mrg1 = new MyRectangle();
		mrg1.setWidth(10);
		mrg1.setDepth(20);
		System.out.println(mrg1.getArea());
		
		MyRectangle mrg2 = new MyRectangle(10, 20);
		System.out.println(mrg2.getArea());
	}

}
