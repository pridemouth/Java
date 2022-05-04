<Java>

	다음주에 JSP 진도 시작해서 급히 컬렉션까지 진도를 나가게 됨(많이 쓰이나 봄).

Collection 프레임워크
	Set(중복 불가, 순서 없음), List(중복 가능, 순서 있음), Queue, Deque
	값만 저장.

	Interface - 컬렉션을 다양한 형태로 사용할 수 있도록 형태를 정의한 것.
	Implementations - 컬렉션 인터페이스를 구현한 클래스들.
	Algorism - 구현체에 정렬, 검색 등 유용한 메소드를 제공.
	
Map
	SortedMap, HashMap, TreeMap etc.
	키와 값을 동시에 저장함.
	
	
Iterator
	collection framework의 멤버 interface.
	
	.next() : 다음 요소로 이동하며 값을 읽음.
	.hasNext() : 더 읽을 값이 있는지 확인하여, 있으면 true / 없으면 false 반환