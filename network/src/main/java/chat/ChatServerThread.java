package chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ChatServerThread extends Thread {

	private String nickname;
	private Socket socket;
	private static List<Writer> listWriters = new ArrayList<Writer>();
	private BufferedReader br;
	private PrintWriter pw;

	public ChatServerThread(Socket socket) {
		this.socket = socket;
	}

	public ChatServerThread(Socket socket, List<Writer> listWriters) {
		this.socket = socket;
		this.listWriters = listWriters;
	}

	@Override
	public void run() {

		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
			pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));

			while (true) {
				String request = br.readLine();
				if (request == null) {
					log("클라이언트 부터 연결 끊김");
					break;
				}
				String[] tokens = request.split(":");
				for (int i = 0; i < tokens.length; i++) {
					System.out.println("토큰값 : " + i + ":" + tokens[i]);
				}
				if ("join".equals(tokens[0])) {
					doJoin(tokens[1], pw);
				} else if ("message".equals(tokens[0])) {
					doMessage(tokens[1] + ":" + tokens[2]);

				} else if ("quit".equals(tokens[0])) {
					doQuit(pw);
				} else {
					log("이유 알수없음");
				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void log(String value) {
		System.out.println("[ChatServerThread]" + value);

	}

	private void doQuit(Writer writer) {

		String data = nickname + "님이 나가셨습니다.";
		broadcast(data);
		listWriters.remove(writer);
	}

	private void doMessage(String message) {
		broadcast(message);

	}

	private void doJoin(String nickname, Writer writer) {

		this.nickname = nickname;
		String data = nickname + "님이 참여하였습니다.";
		broadcast(data);
		addWriter(writer);
		pw.println("join:" + data);
		pw.flush();


	}

	private void addWriter(Writer writer) {
		synchronized (listWriters) {
			listWriters.add(writer);

		}
	}
	
	private void removeWriter(Writer writer) {
		synchronized (listWriters) {
			listWriters.remove(writer);

		}
	}

	private void broadcast(String data) {
		synchronized (listWriters) {
			for (Writer writer : listWriters) {

				PrintWriter printWriter = (PrintWriter) writer;
				System.out.println(data);
				printWriter.println(data);
				printWriter.flush();
			}

		}
	}

}
