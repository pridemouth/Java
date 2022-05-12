package example;

import java.io.BufferedReader;
import java.io.FileReader;

//	reader.ready()
//	reader.printLine()

public class misc {

	public static void main(String[] args) {
		
		try
		{
			String path = "./txt/misc.txt";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			while(reader.ready())
			{
				System.out.println(reader.readLine());
			}
			
			reader.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
