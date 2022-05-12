package example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import java.util.Scanner;

//	stream reader/writer

public class Src01 {

	public static void main(String[] args) {
		
		try
		{
			Scanner sc = new Scanner(System.in);
			
			InputStreamReader reader = new InputStreamReader(System.in);
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("./txt/Src01.txt"));
			
			System.out.print("input characters >> ");
			int ch = 0;
			
			while((ch = reader.read()) != '\n')
			{
				System.out.print((char)ch);
				writer.write((char)ch);
			}
			
			reader.close();
			writer.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
