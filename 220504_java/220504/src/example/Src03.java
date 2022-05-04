package example;

public class Src03
{
	public static void main(String[] args)
	{
		int[] test = new int[5];
		
		System.out.println("<MAIN START>");
		System.out.println("<INPUT>");
		try
		{
			// test[10] = 90;
			throw new ArrayIndexOutOfBoundsException("idx 10 - out of bound");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("<MAIN END>");
		}
	}
}
