package hw2;

public class TestNineNine {
	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 9; i ++) {
			j = 1;
			while(j <= 9) {
				System.out.printf(" %d*%d=%2d", i, j, i * j);
				j++;
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		
		int a,b;
		for(a = 1; a <= 9; a++) {
			b = 1;
			do {				
				System.out.printf(" %d*%d=%2d",a, b, a*b);			
				b++;
			}while(b <= 9);
			System.out.println();
		}
		System.out.println("--------------------------------------------------------------");
		
		int x = 1, y;
		while(x <=9) {
			y = 1;
			do {
				System.out.printf(" %d*%d=%2d",x, y, x*y);
				y ++;
			}while(y <= 9);
			System.out.println();
			x++;
		}
		
	}
}
