package example;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;

public class Src01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("txt/test.txt");
		FileOutputStream fos = new FileOutputStream("txt/data_copy.txt");
		
		int buf;
		while((buf = fis.read()) != -1)
		{
			System.out.print((char) buf);
			fos.write(buf);
		}
		fis.close();
		fos.close();
	}
}
