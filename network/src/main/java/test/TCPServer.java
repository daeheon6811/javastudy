package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			// 1. 소켓 생성
			serverSocket = new ServerSocket();

			// 2. 바인딩(Binding)
			// Socket에 InetSocketAddress(IPAddress + Port)
			// IPAddress : 0.0.0.0 : 모든 IP 연결 허용
			serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000));

			Socket socket = serverSocket.accept(); // blocking

			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();

			System.out.println("연결");

			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHost = inetRemoteSocketAddress.getPort();
			System.out.println("[server] 연결됨 by 클라이언트 : [" + remoteHostAddress + ":" + remoteHost + "]");

			try {
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();

				while (true) {
					byte[] buffer = new byte[256];
					int readByteCount = is.read(buffer);

					if (readByteCount == -1) {
						// 클라이언트가 정상적으료 종료(close() 호출 )
						System.out.println("[server] close by client");
						break;
					}
					String data = new String(buffer, 0, readByteCount, "utf-8");
					System.out.println("[server] received :" + data);

					// 5. 데이터 쓰기
					os.write(data.getBytes("utf-8"));

				}
			} catch (SocketException e) {

				System.out.println("[server] suudend closed by client" + e);

			} catch (IOException e) {
				e.printStackTrace();

			} finally {

				try {

					if (socket != null && serverSocket.isClosed()) {
						socket.close();
					}
				} catch (IOException e) {
					e.printStackTrace();

				}
			}

			// 3 accept
			// 클라이언트의 연결 요청을 기다린다.

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (serverSocket != null && serverSocket.isClosed()) {

					// 서버소켓 생성
					serverSocket.close();

				}
			} catch (IOException e) {

			}
		}
	}

}
