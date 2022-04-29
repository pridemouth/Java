package example;

public class Src03 {

	public static void main(String[] args) {

		WrapTest wt = new WrapTest();
		DummyClass dc = new DummyClass();
		Object[] obj = {39, 3.14f, true, 'c', "Alpha", dc};
			
		for(int i=0; i<obj.length; i++)
		{
			wt.add(obj[i]);
		}
			
		wt.print();
		// System.out.println(wt);
		
		///////////////////////
		
		//	StringBuilder sb1 = new StringBuilder("123");
		//	StringBuilder sb2 = new StringBuilder("456");
		
		//	int num1 = Integer.parseInt(sb1.toString());
		//	int num2 = Integer.parseInt(sb2.toString());
		
		//	System.out.println(sb1.append(sb2));
		//	System.out.println(num1 + num2);
	}

}

class DummyClass
{
	int x = 0;
	int y = 1;
}

class WrapTest
{
	final int ARR_SIZE = 6;
	public Object[] arr = new Object[ARR_SIZE];
	public int cnt = 0;
	
	public void add(Object _obj)
	{
		arr[cnt++] = _obj;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<cnt; i++)
		{
			sb.append(arr[i] + " ");
		}
		return sb.toString();
	}
	
	public void print()
	{
		for(int i=0; i<this.cnt; i++)
		{
			Object o = arr[i];
			
			if(o instanceof Integer)
			{
				System.out.println("instance of Integer : " + ((Integer)o).intValue());
			}
			else if(o instanceof Float)
			{
				System.out.println("instance of Float : " + ((Float)o).floatValue());
			}
			else if(o instanceof Character)
			{
				System.out.println("instance of Character : " + ((Character)o).charValue());
			}
			else if(o instanceof Boolean)
			{
				System.out.println("instance of Boolean : " + ((Boolean)o).booleanValue());
			}
			else if(o instanceof String)
			{
				System.out.println("instance of String : " + o.toString());
			}
			else
			{
				System.out.println("instance of " + o.getClass().toString() + " : " + o.toString());
			}
		}
	}
}
