package example;

//	overloading, overriding

public class Src03 {

	public static void main(String[] args) {
		
		A a = new A();
		a.hello();
		a.bye();
		
		System.out.println("===============");
		
		B b = new B();
		b.hello();
		b.bye("���˾�");
	}
}

class A
{
	void hello()
	{
		System.out.println("A says hello");
	}
	
	void bye()
	{
		System.out.println("�߰�");
	}
	
	void bye(String _name)
	{
		System.out.println(_name + ", �߰�");
	}
}

class B extends A
{
	void hello()
	{
		System.out.println("B says hello");
		System.out.println("hahahaha");
	}
	
	void bye()
	{
		System.out.println("��");
	}
	
	void bye(String _name)
	{
		System.out.println(_name + ", ��");
	}
}