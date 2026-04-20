package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Hw7 {

	
	public static void main(String[] args) {
		
//		請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
//			Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料
		
		try {
			String str;
			int t, j, sumLine = 0,sumByte = 0, sumChar = 0;
	        FileReader fr = new FileReader("./Sample.txt");
	        while ((t = fr.read()) != -1) {
				sumChar += 1;
			}
	        FileReader fr2 = new FileReader("./Sample.txt");
	        BufferedReader br = new BufferedReader(fr2) ;
	        while ((str = br.readLine()) != null) {
	        	sumLine += 1;
	        	}
	        br.close();   
	        fr.close();
			FileInputStream fis = new FileInputStream("./Sample.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			while ((j = bis.read()) != -1) {
				sumByte += 1;
			}
			System.out.printf("Sample.txt檔案共有 %d個位元組, %d個字元, %d列資料。", sumByte, sumChar, sumLine);
	        System.out.println();

			bis.close();
			fis.close();
		}catch(IOException ie){
			ie.printStackTrace();
		}
		
	}
}
