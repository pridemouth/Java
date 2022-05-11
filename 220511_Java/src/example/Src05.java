package example;

//	BufferReader.readLine()
//	BufferWriter.write(___ + "\n")

import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Src05 {

	public static void main(String[] args) {
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("./txt/test4.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("./txt/test4_copy_copy.txt"));
			
			String strBuf = null;
			while((strBuf = br.readLine()) != null)
			{
				System.out.println(strBuf);
				bw.write(strBuf + "\n");
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
