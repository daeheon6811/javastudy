package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ChatClientThread extends Thread {

	private Socket socket = null;
	private BufferedReader br;
	private String nickname;

	public ChatClientThread(String nickname , Socket socket, BufferedReader br) {
		this.nickname = nickname;
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
		} catch (IOException e) {
			System.out.println("시스템을 종료합니다.");
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (br != null)
					br.close();

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
