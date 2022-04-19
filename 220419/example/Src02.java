package example;

public class Src02 {

	public static void main(String[] args)
	{
		Product p = new Product();
		TV t = new TV();
		Computer c = new Computer();
		
		p.turnOn();
		p.turnOff();
		
		System.out.println("===========================");
		
		t.turnOn();
		t.channelUp();
		System.out.println(t.getNo());
		t.ChannelDown();
		t.turnOff();
		
		System.out.println("===========================");
		
		c.turnOn();
		c.setUpBIOS();
		c.turnOff();

	}
}

class Product
{
	protected int no;
	protected String name;
	
	Product()
	{
		this.no = -1;
		this.name = null;
	}
	
	Product(int _no, String _name)
	{
		this.no = _no;
		this.name = _name;
	}
	
	void turnOn()
	{
		System.out.println("전원을 켬.");
	}
	
	void turnOff()
	{
		System.out.println("전원을 끔.");
	}
}

class TV extends Product
{
	protected int channel;
	protected int inch;
	
	TV()
	{
		super();
		this.channel =-1;
		this.inch = -1;
	}
	
	int getNo()
	{
		return this.no;
	}
	
	TV(int _no, String _name, int _channel, int _inch)
	{
		super(_no, _name);
		this.channel = _channel;
		this.inch = _inch;
	}
	
	void channelUp()
	{
		this.channel++;
		System.out.println("채널을 올림.");
	}
	
	void ChannelDown()
	{
		this.channel--;
		System.out.println("채널을 내림.");
	}
}

class Computer extends Product
{
	protected int ram;
	protected int hdd;
	
	Computer()
	{
		super();
		this.ram = -1;
		this.hdd = -1;
	}
	
	Computer(int _no, String _name, int _ram, int _hdd)
	{
		super(_no, _name);
		this.ram = _ram;
		this.hdd = _hdd;
	}
	
	void setUpBIOS()
	{
		System.out.println("BIOS를 셋업함.");
	}
}
