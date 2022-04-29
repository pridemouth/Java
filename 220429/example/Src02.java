package example;
import java.util.Scanner;

public class Src02 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String id = "°Å½Ã±â";
		String pw = "1234";
		String idTemp = null;
		String pwTemp = null;
		
		
		System.out.print("ID >> ");
		idTemp = sc.nextLine();
		
		System.out.print("PW >> ");
		pwTemp = sc.nextLine();
		
		if(id.equals(idTemp) && pw.equals(pwTemp))
		{
			System.out.println("SIGNIN SUCCESS");
		}
		else
		{
			System.out.println("SIGNIN DENIED");
		}
	}
}
