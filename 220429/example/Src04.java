package example;

public class Src04 {

	public static void main(String[] args) {

		int numA = 100;
		Integer numB = Integer.valueOf(100);
		
		if(numB instanceof Integer) System.out.print(true);
		else System.out.print(false);
		
		System.out.print(", ");
		
		if(numB.equals(numA)) System.out.print(true);
		else System.out.print(false);
		// open declaration : F3
		
	}

}
