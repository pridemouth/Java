package example;

//	BufferedInputStream.read()
//	BufferedOutputStream.write()

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Src03
{
	public static void main(String[] args)
	{
		final int EOF = -1;
		
		try
		{
			//	input, output Stream
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./txt/test3.txt"));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./txt/test3_copy.txt"));
			
			int buf = 0;
			while((buf = bis.read()) != EOF)
			{
				System.out.print((char)buf);
				bos.write(buf);
			}
			
			bis.close();
			bos.close();
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
