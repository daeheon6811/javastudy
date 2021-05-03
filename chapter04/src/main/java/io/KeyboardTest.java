package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {

		// 1. 기반 스트림 (표준입력 , stdin, System.in);
		
		InputStreamReader isr = null;
		// 3. 보조 스트림2 (char1|char2|char3|\n -> char1char2char3)
		BufferedReader br = null;
		try {

			// 2. 보조 스트림1 (byte|byte|byte| -> char)
			 isr = new InputStreamReader(System.in , "utf-8");
			
			// 3. 보조 스트림2 (char1|char2|char3|\n -> char1char2char3)
			 br = new BufferedReader(isr);
			
			String line = null;
			int index = 0;
			while ((line = br.readLine()) != null) {
				if("quit".equals(line))
					break;
				
				index++;
				System.out.print(index);
				System.out.print(":");
				System.out.print(line);
				System.out.print("\n");

			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println("error:" + e);
		}
		 catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("error:" + e);
			}
		 finally {
			
			 try {
				isr.close();
				 br.close();
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
