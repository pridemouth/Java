package example;

public class Src05 {

	public static void main(String[] args) {

		char[] arr = {'g', 'h', 'i'};
		
		String str1 = "abc";
		String str2 = new String("def");
		String str3 = new String(arr);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		//
		
		int numA = Integer.valueOf("123").intValue();
		int numB = Integer.parseInt("123");
		System.out.println(numA + ", " + numB);
	}
}
