package example;

public class Src01 {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		for(int i=0; i<3; i++) {
			arr[i] = i;
		}
	
		//	#1
		try {
			for(int i=0; i<4; i++) {
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		finally { }
		
		//	#2	//
		try {
			int i = 4/0;
		}
		catch(Exception e) {
			System.out.println(e.toString());
			int i = 4/1;
		}
		finally { }
		
		// #3	//
		try
		{
			String str = null;
			for(int i=0; i<str.length(); i++)
			{
				System.out.println(str.charAt(i));
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e.toString() + "###123123");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally {}
	}
}
