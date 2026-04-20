package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomDate {
	
//	請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//			append功能讓每次執行結果都能被保存起來)
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("./Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			int[] numb = randomNumb(1000, 10);
			for(int i = 0; i < 10; i++) {
				pw.print(numb[i] + " ");
			}
			pw.println();
			
			pw.close();
			bw.close();
			fw.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		
	}
	public static int[] randomNumb(int range, int count) {
		int[] randomNumb = new int[count];
		for(int i = 0; i < count; i++) {
			randomNumb[i] = (int)(Math.random() * range) + 1;
		}
		return randomNumb;
	}
	
}
