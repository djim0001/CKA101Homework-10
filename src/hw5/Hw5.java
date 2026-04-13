package hw5;

import hw3.Hw3Tool;

public class Hw5 {
	
	public static void main(String[] args) {
//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//		圖:
		Hw5 hw5 = new Hw5();
		Hw3Tool h3t = new Hw3Tool();
		int width = h3t.numbCheck("請輸入寬：");
		int height = h3t.numbCheck("請輸入高：");
		hw5.starSquare(width, height);
		
//		• 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		hw5.rangeAvg();
		
	}
	public void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void rangeAvg() {
		Hw3Tool h3t = new Hw3Tool();
		int[] numb = h3t.numbRandomPick1Start(100, 10);
		int sum = 0;
		for(int i = 0; i < numb.length; i++) {
			sum += numb[i];
			System.out.print(numb[i] + " ");
		}
		System.out.println();
		System.out.println("平均值為：" + (sum / numb.length));
		
	}
	
}
