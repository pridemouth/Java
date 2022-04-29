package example;

public class Src06 {

	public static void main(String[] args) {

		char[] arr = {'g', 'o', 'o', 'd'};
		
		String str1 = "hello";
		String str2 = new String("java");
		String str3 = new String(arr);
		String str4 = new String();
		
		str4 = str1 + " " + str2 + " " + str3;
		System.out.println(str4);
		
		///////////////////////////////////
		
		String s_i = "123";
		String s_f = "23.5";
		String s_d = "234.567";
		
		int i = Integer.valueOf(s_i).intValue();
		float f = Float.valueOf(s_f).floatValue();
		double d = Double.valueOf(s_d).doubleValue();
		
		System.out.println(s_i + s_f + s_d);
		System.out.println(i + f + d);
				
		///////////////////////////////////
		
		int x = Integer.parseInt("123");
		float y = Float.parseFloat("23.5");
		System.out.println(x + y);
		
		System.out.println("x + y = " +  x + y);
		System.out.println("x + y = " +  (x + y));
		
		///////////////////////////////////
		
		String str5 = String.valueOf(x);
		System.out.println(str5 + 8);
		System.out.println(8 + str5);
		
		///////////////////////////////////
		
		String str6 = Integer.toString(i);
		String str7 = Float.toString(f);
		String str8 = Double.toString(d);
		
		System.out.println(str6);
		System.out.println(str7);
		System.out.println(str8);
	}

}
