package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Copy {

//	請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所
//	代表的檔案會複製到第二個參數代表的檔案
	
	public void copyFile(File origFile, File copyFile) throws IOException {
		
		FileReader fd = new FileReader(origFile);
		BufferedReader br = new BufferedReader(fd);
		FileWriter fw = new FileWriter(copyFile);
		BufferedWriter bf = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bf);
		
		String str;
		while((str = br.readLine()) != null) {
			pw.println(str);
		}
		
		pw.close();
		bf.close();
		br.close();
		fw.close();
		fd.close();
		
	}
}
