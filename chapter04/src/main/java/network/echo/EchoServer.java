package network.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class EchoServer {

	public static final int PORT = 8000;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;

		try {
			// 1. 소켓 생성
			serverSocket = new ServerSocket();

			// 2. 바인딩(Binding)
			// Socket에 InetSocketAddress(IPAddress + Port)
			// IPAddress : 0.0.0.0 : 모든 IP 연결 허용
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			System.out.println();

			Socket socket = serverSocket.accept(); // blocking

			InetSocketAddress inetRemoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();

			log("start....[port:" + PORT + "]");
			String remoteHostAddress = inetRemoteSocketAddress.getAddress().getHostAddress();
			int remoteHost = inetRemoteSocketAddress.getPort();
			log("연결됨 by 클라이언트 : [" + remoteHostAddress + ":" + remoteHost + "]");

			try {
				
				OutputStream os = socket.getOutputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(new OutputStreamWriter(os, "utf-8"), true);

				while (true) {

					String data = br.readLine();
					if (data == null) {
						log("closed by client");
						break;
					}
					log(" received :" + data);

					// 6. 데이터 쓰기
					pw.write(data);

				}
			} catch (SocketException e) {

				log("suudend closed by client" + e);

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

	private static void log(String log) {
		System.out.println("[EchoServer]" + log);
	}

}
