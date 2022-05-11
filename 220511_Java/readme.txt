
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
		
		
#기본 형태
		
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.File;


	FileInputStream fis = new FileInputStream("__PATH__");
	FileOutputStream fos = enw FileOutputStream("__PATH__");
	
	int buf;
	while((buf = fis.read()) != -1)
	{
		System.out.print((char) buf);
		fos.write(buf);
	}
	fis.close();
	fos.close();
	

Buffered Stream
	지정 크기의 버퍼를 만들어, 해당 크기만큼 한 번에 입/출력. (속도 향상됨)
	보조 스트림으로써, 단독으로 사용할 수 없고, 항상 i/o stream과 함께 사용됨.
	
	보조 스트림을 close()하면, 기반 스트림도 자동으로 close()됨.
	(보조 스트림을 close()한 이후, 기반 스트림에 접근하려 하면 오류 터트림)
	
	
********
C:\Program Files\Java\jdk-18.0.1.1\bin\javaw.exe
C:\Users\student\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.2.v20220201-1208\jre\bin\javaw.exe
