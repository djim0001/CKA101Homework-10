package hw6;

import java.util.Scanner;

public class Calculator {
	
	private int x;
	private int y;
	
	public void setX() throws CalException {
		System.out.println("請輸入 x 的值：");
		Scanner scr = new Scanner(System.in);
		if(scr.hasNextInt()) {
			x = scr.nextInt();
		}else {
			throw new CalException("輸入格式不正確");
		}
	}
	public int getX() {
		return x;
	}
	public void setY() throws CalException {
		System.out.println("請輸入 y 的值：");
		Scanner scr = new Scanner(System.in);
		if(scr.hasNextInt()) {
			y = scr.nextInt();
		}else {
			throw new CalException("輸入格式不正確");
		}
	}
	public int getY() {
		return y;
	}
	
	public int powerXY(int x, int y) throws CalException{
		
		if(x == 0 && y == 0) {
			throw new CalException("0 的 0 次方沒有意義");
		}else if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}else {
			this.x = x;
			this.y = y;
		}
		return (int) Math.pow(x, y);
	}
	
}
