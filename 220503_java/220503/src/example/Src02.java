package example;
import java.io.IOException;

public class Src02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("IOTest");
		int ch = 0;

		System.out.print("���ڸ� �Է��Ͻÿ� >> ");
			
		while(ch != '\n')
		{
			ch = System.in.read();
			System.out.println((char)ch);
		}
			
	}
}
