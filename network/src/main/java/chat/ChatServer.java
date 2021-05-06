package chat;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
	
	public static final int PORT = 8005;

	public static void main(String[] args) throws IOException {
		
	    ServerSocket serverSocket = new ServerSocket();
	    
	    String hostAddress = InetAddress.getLocalHost().getHostAddress();
	    serverSocket.bind(new InetSocketAddress(hostAddress , PORT));
	    
	    log("연결 기다림 "  + hostAddress + ":" + PORT);
	    
	    
	    while(true) {
	    	Socket socket = serverSocket.accept();
	    	ChatServerThread st = new ChatServerThread(socket);
	    	st.start();
	    }
	}
	
	
	
	public static void log(String log) {
		System.out.println("[ChatServer] " + log);
	}
}
