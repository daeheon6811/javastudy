package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class ChatClientThread extends Thread {

	private Socket socket = null;
	private BufferedReader br;

	public ChatClientThread(Socket socket, BufferedReader br) {
		this.socket = socket;
		this.br = br;
	}

	@Override
	public void run() {
		try {
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} 
		catch (SocketException e) {
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
