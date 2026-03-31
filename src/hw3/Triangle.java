package hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		
		int side[] = new int[3];
		side[0] = tri.sideCheck("1");
		side[1] = tri.sideCheck("2");
		side[2] = tri.sideCheck("3");
		Arrays.sort(side);
		Double sidePow1 = (Math.pow(side[0], 2)),
				sidePow2 = (Math.pow(side[1], 2)),
				sidePow3 = (Math.pow(side[2], 2));
		if(side[0] > 0 && side[0] + side[1] > side[2] ) {	
			if(side[0] == side[2] ) {
				System.out.println("此三角形為正三角形。");
			}else if(side[0] == side[1] || side[1] == side[2]) {
					System.out.println("此三角形為等腰三角形。");
			}else if(sidePow1 + sidePow2 == sidePow3){
				System.out.println("此三角形為直角三角形。");
			}else {
				System.out.println("此三角形為其他三角形。");
			}
		}else{
			System.out.println("不是三角形。");
		}
	}
		
	public int sideCheck(String num) {
		Scanner scr = new Scanner(System.in);
			while(true) {
				System.out.printf("請輸入數字" + num + " :");
				if(scr.hasNextInt()) {
					int side = scr.nextInt();	
					return side;
				}else {	
					scr.nextLine();
					System.out.println("錯誤，請輸入整數");
					continue;
				}
			}
	}
		
}
	

