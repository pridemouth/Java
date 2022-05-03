package example;
import java.io.IOException;

public class Src04 {

	public static void main(String[] args) {
		
		ThrowExcp te1 = new ThrowExcp();
		
		try
		{
			System.out.println(te1.subString(0));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		// str != null
		// ThrowExcp te2 = new ThrowExcp("nothing");
		// System.out.println(te2.subString(0));
		
	}

}

class ThrowExcp
{
	String str;
	
	ThrowExcp()
	{
		this.str = null;
	}
	
	ThrowExcp(String _str)
	{
		this.str = _str;
	}
	
	public String subString(int idx) throws MyException, NullPointerException, ArithmeticException
	{
		if(str == null)
		{
			System.out.println("str is null");
			//throw new NullPointerException();	// 예외를 발생시키기
			throw new MyException(5);
		}
		else
			return str.substring(idx);
	}
}

class MyException extends Exception
{
	int idx;
	
	MyException()
	{
		this.idx = 0;
	}
	
	MyException(int _idx)
	{
		this.idx = _idx;
	}
	
	public String toString()
	{
		return this.getClass().toString().substring("class ".length()) + " : input more than " +  this.idx;
	}
}
