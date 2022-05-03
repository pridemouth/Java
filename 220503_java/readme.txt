<java>

	compile error : 문법적인 오류. 컴파일러가 알려줌.
	runtime error : 논리적인 오류. 컴파일러가 못 잡음.
		error : 메모리 부족, 스택 오버플로우 등의 발생. 심각한 오류.
		exception : 비교적 덜 심각한 오류.
			IOException, ClassNotFoundException : checked exception - 예외처리가 필요한 예외들
			RuntimeException : unchecked exception - 굳이 예외처리까지는 필요없는 오류.
			
	try {
		// 예외 발생이 예측되는 구문
	}
	catch(Exception e) {
		// 예외에 대한 처리
	}
	finally {
		// 예외발생으로 인해 프로그램이 중단되더라도 꼭 실행하는 코드
	}
	
	throws Exception
		// 예외처리 보류