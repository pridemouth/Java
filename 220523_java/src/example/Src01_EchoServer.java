package example;

//	Socket Programming (TCP)
//	1. open socket
//	2. open stream
//	3. in, output data
//	4. close stream
//	5. close socket

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.ServerSocket;
import java.net.Socket;
//	import java.net.UnknownHostException;

public class Src01_EchoServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = new ServerSocket(4444);
		System.out.println("Server Start");
		
		while(true)
		{
			Socket socket = serverSocket.accept();
			
			//	Receive msg "Hello Echo" from Echo Client
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = in.readLine();
			System.out.println("Server : \"" + str + "\" msg received");
			
			//	Send msg "Hello Echo" to Echo Client
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(str);
			out.flush();
			break;
		}
		
		System.out.println("Server End");
		serverSocket.close();
		
	}

}
