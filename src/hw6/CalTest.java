package hw6;

public class CalTest {

	public static void main(String[] args) {
		
		Calculator clt = new Calculator();
		int powerXY = -1;
		while(powerXY < 0) {
			try {
				clt.setX();
				clt.setY();
				powerXY = clt.powerXY(clt.getX(), clt.getY());
				System.out.printf("%d 的 %d 次方等於 %d", clt.getX(), clt.getY(), powerXY);
			} catch (CalException e) {
				e.printStackTrace();
			}
		}
	}
	
}
