package example;

public class Src01
{
	public static void main(String[] args)
	{
		Person p = new Person(3, "고길동", "IOT", "노원구");
		Person p2 = new Person();	// 1
		p2.num = 4;

		Student st = new Student();	// 2
		st.subjects = new String[] {"자바","html"};
		st.num = 1;
		st.name = "고철수";
		
		Staff s = new Staff();	// 3
		s.job = "행정";
		s.num = 2;
		s.name = "고영희";
		
		Person person = new Person();	// 4
		System.out.println("====================");
		Student student = new Student();
		System.out.println("====================");
		Staff staff = new Staff();
	}
}

class Person
{
	int num;
	String name;
	String dept;
	String addr;
	
	Person()
	{
		System.out.println("Person() 생성자");
	}
	
	Person(int _num, String _name, String _dept, String _addr)
	{
		this.num = _num;
		this.name = _name;
		this.dept = _dept;
		this.addr = _addr;
	}
}

class Student extends Person
{
	String[] subjects;
	
	Student()
	{
		
	}
}

class Professor extends Person
{
	String[] subjects;
	
	Professor()
	{
		
	}
}

class Staff extends Person
{
	String job;
	
	Staff()
	{
		
	}
}
