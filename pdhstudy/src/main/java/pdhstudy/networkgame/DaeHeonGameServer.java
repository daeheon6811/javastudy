package pdhstudy.networkgame;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class DaeHeonGameServer {

	public static final int PORT = 8000;

	public static void startGameServer() {

		Socket socket = null;

		try {
			SocketAddress socketAddress = new InetSocketAddress("0.0.0.0", PORT);
			ServerSocket serverSocket = new ServerSocket(8000);
			serverSocket.bind(socketAddress);			
			while (true) {
				socket = serverSocket.accept();
			}


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
