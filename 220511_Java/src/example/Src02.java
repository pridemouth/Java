package example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

//	file reader / writer

public class Src02
{
	public static void main(String[] args)
	{
		final int EOF = -1;
		
		try
		{
			//	preference / project 셋팅 말고도
			//	txt파일 인코딩도 UTF-8로 통일시켜줘야 안 깨짐
			FileReader fr = new FileReader("./txt/test2.txt");
			FileWriter fw = new FileWriter("./txt/test2_copy.txt");
			
			//	read from test2.txt
			//	write on test2_copy.txt
			int buf = 0;
			while((buf = fr.read()) != EOF)
			{
				System.out.print((char)buf);
				fw.write(buf);
			}
			
			fr.close();
			fw.close();
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
