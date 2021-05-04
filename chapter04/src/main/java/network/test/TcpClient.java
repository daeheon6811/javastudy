package network.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TcpClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {
		// 1. 소켓 생성

		Socket socket = new Socket();

		try {
			// 서버 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			System.out.println("[client] 서버 연결 성공 !!");

			// 3 IO Stream 받아오기
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 4.쓰기
			String data = "Hello World\n";
			os.write(data.getBytes("utf-8"));

			// 5. 읽기
			byte[] buffer = new byte[255];
			int readByteCount = is.read(buffer); // 블러킹
			if (readByteCount == -1) {
				System.out.println("[Client] closed by server");
				return;
			}
			data = new String(buffer, 0, readByteCount, "utf-8");
			System.out.println("[Client] received:" + data);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (socket != null && socket.isClosed()) {
					socket.close();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
