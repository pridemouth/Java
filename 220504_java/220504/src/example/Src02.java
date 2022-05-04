package example;

//	causing Exception in purpose
public class Src02
{

	public static void method1()
	{
		method2();
	}
	
	public static void method2()
	{
		// int i = 4 / 0;
		throw new ArithmeticException("/ by zero blah blah");
	}
	public static void main(String[] args)
	{
		method1();
		
		try
		{
			method1();	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
