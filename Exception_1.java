package auto_test_26_oct_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception_1 {
	public static void main(String[] args) throws FileNotFoundException {
		
		
		try {
			
			FileInputStream gg = new FileInputStream("C:\\Users\\19794\\Downloads\\testdata26.xlsx");

			
		}
		catch(Exception e) {
			//System.out.println("file not found"+e.getMessage()); 
			
			e.printStackTrace();
			
		}
		
	}
}
