package example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


//	UDP
//	Echo Data Server
public class Src02_EDS {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket sock = new DatagramSocket(4445);
		System.out.println("Server Start");
		
		byte[] buf = new byte[256];
		
		DatagramPacket pack = new DatagramPacket(buf, buf.length);
		sock.receive(pack);
		
		String msg = new String(pack.getData(), 0, pack.getLength());
		
		System.out.println("Msg : " + msg);
		InetAddress addr = pack.getAddress();
		int port = pack.getPort();
		pack = new DatagramPacket(buf, buf.length, addr, port);
		sock.send(pack);
		
		System.out.println("Server End");
		sock.close();
		
	}

}
