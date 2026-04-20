package hw7;

import java.io.File;
import java.io.IOException;

public class CopyTest {

	public static void main(String[] args) {
		
		try {
			Copy cy = new Copy();
			File f1 = new File("./Data.txt");
			File f2 = new File("./Data2.txt");
			cy.copyFile(f1, f2);
		}catch(IOException ie) {
			ie.printStackTrace();
		}
		
		
	}
	
}
