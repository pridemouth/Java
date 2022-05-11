package example;

//	BufferReader.read()
//	BufferWriter.write()

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Src04 {

	public static void main(String[] args) {
		
		final int EOF = -1;
		
		try
		{
			//	Reader, Writer
			BufferedReader br =
					new BufferedReader(new FileReader("./txt/test4.txt")); 
			BufferedWriter bw =
					new BufferedWriter(new FileWriter("./txt/test4_copy.txt")); 
			
			int buf = EOF;
			while((buf = br.read()) != EOF)
			{
				System.out.print((char)buf);
				bw.write(buf);
			}
			
			br.close();
			bw.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
