package example;

public class Src01 {

	public static void main(String[] args) {
		
		Member m1 = new Member("aaa", "111", "Seoul");
		System.out.println(m1.toString());
		System.out.println(m1);
		
		Test t = new Test();
		System.out.println(t.toString());
		System.out.println(t);
	}
}

class Test
{
	int x;
	int y;
}

class Member
{
	private String name;
	private String tel;
	private String addr;
	
	public Member(String _name, String _tel, String _addr)
	{
		this.name = _name;
		this.tel = _tel;
		this.addr = _addr;
	}
	
	public String toString()
	{
		return this.name + "," + this.tel + "," + this.addr;
	}
}
