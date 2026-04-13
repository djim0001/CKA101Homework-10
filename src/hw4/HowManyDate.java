package hw4;

import hw3.Hw3Tool;

public class HowManyDate {
	public static void main(String[] args) {
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		
		Hw3Tool htl3 = new Hw3Tool();
		int year = htl3.numbCheck("輸入:");
		int month = htl3.numbCheck(1, 12, "輸入月份:");
		int day = htl3.numbCheck(1, 31,"輸入日期:");
		
		int dateSum = 0;
		System.out.printf("今天是西元%d年%d月%d天%n" , year, month, day);
		int[] leapYear = {
			31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31	
		};
		if(year % 100 == 0 && year % 400 != 0) {
			// nomalYear
			leapYear[1] = 28;		
		}else if(year % 4 != 0) {
			// nomalYear
			leapYear[1] = 28;	
		}else {
			leapYear[1] = 29;	
		}
		for(int i = 0; i <= (month - 2); i++) {
			dateSum += leapYear[i];
		}
		dateSum += day;
		System.out.printf("輸入的日期為該年第%d天", dateSum);
		
		
	}

}
