package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CatDogTest {

	public static void main(String[] args) {
//		請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\data\Object.ser裡。注
//		意物件寫入需注意的事項,若C:\內沒有data資料夾,請用程式新增這個資料夾
		try {
			File dirData = new File("c:/data");
			dirData.mkdir();
			
			Animal[] animal = new Animal[2];
			animal[0] = new Cat("catt");
			animal[1] = new Dog("dogg");
			
			FileOutputStream fos = new FileOutputStream("c:/data/Object.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(int i = 0; i < animal.length; i++) {
				oos.writeObject(animal[i]);
			}
			oos.close();
			fos.close();
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		
//		承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何 (請利用多
//				型簡化本題的程式設計)
		try {
			FileInputStream fis = new FileInputStream("c:/data/Object.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			try {
				while(true) {
					((Animal)ois.readObject()).speak();
				}
			}catch(EOFException e) {
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			ois.close();
			fis.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
	}
	
}
