package example;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//	Echo Data Client
public class Src02_EDC {

	public static void main(String[] args) throws IOException {
		
		//	byte[] buf = {'h', 'e', 'l', 'l', 'o', 'a', 'b', 'c'};
		byte[] buf = "한ㅁㅇㄹ글".getBytes("EUC-KR");
		DatagramSocket sock = new DatagramSocket();
		
		InetAddress addr = InetAddress.getByName("IOT200");
		
		DatagramPacket pack = new DatagramPacket(buf, buf.length, addr, 4445);
		
		sock.send(pack);
		pack = new DatagramPacket(buf, buf.length);
		sock.receive(pack);
		
		String msg = new String(pack.getData(), 0, pack.getLength());
		System.out.println("msg : " + msg);
		
		sock.close();

	}

}
