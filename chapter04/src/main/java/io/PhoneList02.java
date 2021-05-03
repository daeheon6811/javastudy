package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhoneList02 {

	public static void main(String[] args) {
		File file = new File("phone.txt");
		// 1. 기반스트림
		FileInputStream fis = null;

		// 2.보조스트림(byte ->char)
		InputStreamReader isr = null;
		BufferedReader br = null;
		Scanner scanner = null;
		if (!file.exists()) {
			System.out.println("file not found");
			return;

		} else {
			try {
				System.out.println("===========파일 정보===========");
				System.out.println(file.getAbsolutePath());
				System.out.println(file.length() + "bytes");
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				System.out.println(sdf.format(new Date(file.lastModified())));
				System.out.println("===========파일 정보===========");

				// 1. 기반스트림
				fis = new FileInputStream(file);
				// 2.보조스트림(byte ->char)
				isr = new InputStreamReader(fis);
				// 3. 보조 스트림 char1|char2|char3 - > char1char2char2
				br = new BufferedReader(isr);
				// 4 처리

				scanner = new Scanner(file);
				while (scanner.hasNextLine()) {
					String name = scanner.next();
					String phone1 = scanner.next();
					String phone2 = scanner.next();
					String phone3 = scanner.next();

					System.out.println(name + ":" + phone1 + "-" + phone2 + "3" + phone3);

				}

			} catch (IOException e) {

				e.printStackTrace();
			} finally {
				if (scanner != null) {
					scanner.close();
				}

			}

		}

	}

}
