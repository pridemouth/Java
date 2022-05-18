package example;

public class Src02 {

	public static void main(String[] args) {
		
		//	synchronized 키워드와 연계하여 사용할 수 있는
		//	wait() - notify()
		
		Data data = new Data();
		Sync1 s1 = new Sync1(data);
		Sync2 s2 = new Sync2(data);
		
		s1.start();
		s2.start();
	}
}

class Sync1 extends Thread
{
	private Data data;
	
	Sync1(Data _data)
	{
		this.data = _data;
	}
	
	public void run()
	{
		for(int i=0; i<50; i++)
		{
			data.add(1);
		}
	}
}

class Sync2 extends Thread
{
	private Data data;

	Sync2(Data _data)
	{
		this.data = _data;
	}

	public void run()
	{
		for(int i=0; i<50; i++)
		{
			data.sub(1);
		}
	}
}

class Data
{
	private int num;
	
	Data()
	{
		this.num = 0;
	}
	
	Data(int _num)
	{
		this.num = _num;
	}
	
	public synchronized void add(int x)
	{
		this.num += x;
		System.out.println("add(" + x + ") = " + this.num);
		
		if(num >= 10)
		{
			//	이 자원을 사용하는, 대기중인 모든 스레드를 꺠움.
			//	notify()의 경우, 단 하나만 깨움.
			notifyAll();
			
			//	이후, 자신 클래스는 유휴상태로 전환.
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void sub(int x)
	{
		this.num -= x;
		System.out.println("sub(" + x + ") = " + this.num);

		if(num <= 0)
		{
			//	add()와 비슷함.
			notifyAll();
			
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	
	public int getNum()
	{
		return this.num;
	}
}
