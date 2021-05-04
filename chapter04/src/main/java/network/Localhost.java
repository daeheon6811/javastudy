package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Localhost {
	
	public static void main(String[] args) {
		
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
	
			
			
			String hostName = inetAddress.getHostName();
			String hostAddress = inetAddress.getHostAddress();
			
			
			System.out.println(hostName + ":" + hostAddress);
	
			byte test = 4;
			byte[] addresses =inetAddress.getAddress();
			for(byte address : addresses) {
				System.out.print(address & 0x000000ff);
				System.out.print(".");
				
			}
			
			
		
			
			// 0000 0000 0000 0000 0000 0000 1100 0000 -> 192
			
			// 1111 1111 1111 1111 1111 1100 0000 0000 -> -64

			// 0000 0000 0000 0000 0000 0000 1111 1111 		
			
			// 0000 0000 0000 0000 0000 0000 1100 0000 -> 192
			
			// 0000 0000 0000 0000 0000 0000 1100 0000
			
		
			
		
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
