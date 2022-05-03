package example;
import java.io.IOException;

public class Src02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("IOTest");
		int ch = 0;

		System.out.print("문자를 입력하시오 >> ");
			
		while(ch != '\n')
		{
			ch = System.in.read();
			System.out.println((char)ch);
		}
			
	}
}
