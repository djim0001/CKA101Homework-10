package hw4;

import java.util.Arrays;

public class Hw4 {
	public static void main(String[] args) {
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}	
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] arrays1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		(提示:陣列,length屬性)
		Arrays.sort(arrays1);
		int sum = 0;
		for(int i = 0; i < arrays1.length; i++) {
			sum += arrays1[i];
		}
		int sumAverage = sum / arrays1.length;
		System.out.println("平均值為：" + sumAverage);
		System.out.print("大於平均值的數為：");
		for(int j = 0; j < arrays1.length; j++) {
			if(arrays1[j] > sumAverage) {
				System.out.print(arrays1[j] + " ");
			}
		}
		System.out.println();
		System.out.println("================");
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String s = "Hello World";
//		System.out.println(s);
		char[] sChar = s.toCharArray();
		char[] sCharR = new char[sChar.length];
		for(int a = 0; a < sChar.length; a++) {
			sCharR[a] = sChar[sChar.length - a - 1];
		}
		System.out.println(sCharR);
		System.out.println("================");
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
		char[] vowel = {'a','e','i','o','u'};
		String[] solarSystem = 
			{"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		char[][] c = new char[solarSystem.length][];
		for(int n = 0; n < solarSystem.length; n++) {
			c[n] = solarSystem[n].toCharArray();
		}
		int vowelSum = 0;
		for(int outI = 0; outI < c.length; outI++) {
			for(int innerI = 0; innerI < c[outI].length; innerI++) {
				for(int vowelI = 0; vowelI < vowel.length; vowelI++) {
					if(c[outI][innerI] == vowel[vowelI]) {
						vowelSum += 1;
					}
				}
			}
		}
		System.out.println("母音個數共有：" + vowelSum);
	
	}
	
}
