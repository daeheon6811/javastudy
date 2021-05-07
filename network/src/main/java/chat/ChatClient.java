package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Scanner;

public class ChatClient {
	private static final String SERVER_IP = "192.168.80.19";
	private static final int SERVER_PORT = ChatServer.PORT;

	public static void main(String[] args) {

		Scanner scanner = null;
		Socket socket = null;
		BufferedReader br =null;
		PrintWriter pw = null;
		try {
			
			// 1 키보드 연결
			scanner = new Scanner(System.in);
			// 2 소켓 생성
			socket = new Socket();
			// 3 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			// 4 reader/writer 생성

			// 4. IO Stream 받아오기
			 br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			 pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);

			// 5. join 프로토콜
			System.out.print("닉네임>>");
			String nickname = scanner.nextLine();
		
			
			pw.println("join:" + nickname);
			pw.flush();	
			
			String echo = br.readLine();
			String[] tokens = echo.split(":");
			if ("join".equals(tokens[0])) {
				System.out.println(tokens[1]);
			}
		
			
			ChatClientThread chatClientThread =  new ChatClientThread(socket,br);
			chatClientThread.start();

			while (true) {

				System.out.print("<<");
				String message = scanner.nextLine();
				if ("quit".equals(message) == true) {
					pw.println("quit:" + nickname);
					pw.flush();
					break;
				} else {
					pw.println("message:" + nickname +":"+ message);
					pw.flush();
				}
			
			}

		} catch (SocketException e) {
			System.out.println("SE 에러.");
		}
		catch (IOException e) {
			System.out.println("IO 에러.");
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (br != null)
					br.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
