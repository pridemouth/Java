package example;
import java.io.IOException;

public class Src03 {

	public static void main(String[] args) {
		
		IOExc io = new IOExc();

		try
		{
			io.input();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		io.print();
		
	}
}

class IOExc
{
	
	char[] arr = new char[10];
	int i = 0;
	
	void input() throws IOException, ArithmeticException
	{
		//	while((arr[i++] = (char)System.in.read()) != '\n')
		
		while (true)
		{
			arr[i] = (char)System.in.read();
			

			if(arr[i] == '\n')
			{
				break;
			}
			
			i++;
		}
		
	}
	
	void print()
	{
		int j = 0;
		
		while(j < i)
		{
			System.out.println(arr[j]);
			
			j++;
		}
	}
	
}