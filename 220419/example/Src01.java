package example;

public class Src01
{
	public static void main(String[] args)
	{
		Person p = new Person(3, "��浿", "IOT", "�����");
		Person p2 = new Person();	// 1
		p2.num = 4;

		Student st = new Student();	// 2
		st.subjects = new String[] {"�ڹ�","html"};
		st.num = 1;
		st.name = "��ö��";
		
		Staff s = new Staff();	// 3
		s.job = "����";
		s.num = 2;
		s.name = "����";
		
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
		System.out.println("Person() ������");
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
