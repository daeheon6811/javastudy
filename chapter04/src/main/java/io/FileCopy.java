package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("dooly.png");
			os = new FileOutputStream("dooly.copy.png");

			int data = -1;

			while ((data = is.read()) != -1) {
				os.write(data);
			}

		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다." + e);

		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("에러 " + e);
		} finally {
			if (is != null) {
				try {
					is.close();
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

}
