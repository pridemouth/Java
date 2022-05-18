package example;

public class Src01 {

	public static void main(String[] args) {
		
		//		m 자원이 공유되기 때문에
		//	스레드 간 간섭이 발생하여
		//	메시지가 의도한 대로 출력되지 않음.
		
		//	-> 동기화 필요
		
		//	#1
		//	메소드에 synchronized 키워드 적용
		//	방식 : 각 메소드를 사용 중에 공유중인 자원에 대해 간섭을 방지
		//	장점 : 다른 스레드의 작업을 막지 않으니
		//		이 방식이 속도는 더 빠를 듯
		
		//	#2
		//	synchronized block
		//	방식 : 블록화한 일체의 메소드, 과정에 대해 간섭을 방지
		//	장점 : 자원을 여러 스레드에서 공유할 경우
		//		결과값의 섞임을 방지하려면 이 방식이 적절할 듯
			
		Msg m = new Msg();
		
		MyThread t0 = new MyThread(m);
		t0.start();

		MyThread t1 = new MyThread(m);
		t1.start();

		MyThread t2 = new MyThread(m);
		t2.start();
	}
}

class MyThread extends Thread
{
	private Msg m;
	
	MyThread(Msg newMsg)
	{
		this.m = newMsg;
	}
	
	//	필수
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			processMsg(i);
		}
	}
	
	public void processMsg(int idx)
	{
		synchronized(m)
		{
			m.write(getName() + " message[" + idx + "]");
			
			try
			{
				sleep(1);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			m.print();
		}
	}
}

class Msg
{
	private String str; 
	
	public Msg()
	{
		this.str = "default msg";
	}
	
	public Msg(String newStr)
	{
		this.str = newStr;
	}
	
	public void print()	//synchronized
	{
		System.out.println(str);
	}
	
	public void write(String newStr) //synchronized
	{
		this.str = newStr;
	}
	
	public int length()
	{
		return this.str.length();
	}
}
