
보조스트림
	BufferedI/OStream
	BufferedReader/Writer
	DataI/OStream - 별도의 데이터 단위(타입)로 입출력 실행 (별도의 포맷으로 저장하기 때문에, 원래 메모장으로 확인하면 깨져 보임)
	
기반 스트림
	I/OStream - byte 단위로 입/출력, int형(10진수 utf-16값)
	I/OStreamReader, Writer - char 단위(2byte)로 입/출력, 
	FileI/OStream
	FileReader/Writer
	
객체 스트림
	ObjectI/OStream.w/rObject()
	
	
<Scanner, InputStream, BufferedStream에 대한 글>
	https://st-lab.tistory.com/41
	
	? 정규식
	
	1)	
		Scanner scan = Scanner(System.in);
		//	System.in은 InputStream타입의 static 변수임.
			==
		InputStream input = System.in;
		Scanner scan = new Scanner(input);
		
	2)
		

각종 Stream 상속관계도

	? 데코레이터 패턴

	Byte Stream
	
		8bit 단위 바이트 데이터 취급.
	
		InputStream	> FileInputStream
					> ObjectInputStream
					> FilterInputStream	> DataInputStream
										> BufferedInputStream

		OutputStream> FileOutputStream
					> ObjectOutputStream
					> FilterOutputStream> BufferedOutputStream
										> DataOutputStream

	Character Stream
	
		16bit 단위 유니코드 문자 데이터 취급.
	
		Reader	> InputStreamReader	> FileReader
				> BufferedReader
				
				int read()
				boolean ready()
				
		Writer	> OutputStreamWriter> FileWriter
				> BufferedWriter
				> PrintWriter
				
				void write()
				void flush() : 버퍼 비우기

Serializable

	직렬화		객체의 멤버변수를 한 줄로 세움
	역직렬화	분열된 멤버변수를 모아 하나의 객체로 만듦
	
	변수의 전달 과정에서(다른 메모리 영역으로 이동 시) 사용.