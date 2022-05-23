package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.Socket;
import java.net.UnknownHostException;

public class Src01_EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {

		//	192.168.0.200
		
		Socket socket = new Socket("localhost", 4444);
		
		//	Send msg "Hello Echo" to Echo Server
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.println("rkskekfk");
		
		
		//	Receive msg "Hello Echo" from Echo Server
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = in.readLine();
		System.out.println("Client : \"" + str + "\" msg received");
		socket.close();

	}

}
