
byte stream
	byte(8bit) 단위로 처리
	최상위 클래스 : InputStream/OutputStream

character stream
	문자 단위로 처리(2Byte)
	최상위 클래스 : Reader/Writer

System 클래스
	모든 멤버변수/메소드는 static
	System.in : 표준 입력 스트림
	System.out : 표준 출력 스트림
		IOException 발생시키지 않음.
		
		
#1
		
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;


	FileInputStream fis = ne wFileInputStream("__PATH__");
	FileOutputStream fos = enw FileOutputStream("__PATH__");
	
	int buf;
	while((buf = fis.read()) != -1)
	{
		System.out.print((char) buf);
		fos.write(buf);
	}
	fis.close();
	fos.close();
	
#2

