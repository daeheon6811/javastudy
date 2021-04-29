package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileTest {
	
	@SuppressWarnings("resource")
	public static void main(String[] args)  {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("hello.txt");
			int date= fis.read();
			for(int i = 0 ; i  < 10; i++) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error:" + e);
		}
		finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}
			catch (Exception e) {
			e.printStackTrace();
			}
			
		}
		
		
	}

}
