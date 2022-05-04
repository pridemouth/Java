package example;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Src05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		
		// #1. input
		al.add("가나다");
		al.add("라마바");
		al.add("사아자");
		al.add("사아자");
		al.set(3, "차카타");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(" " + i + " : " + al.get(i));
		}

		System.out.println();
		
		// #2. search by value
		System.out.print("search >> ");
		String tempStr = sc.nextLine();
		int idx = 0;
		if(al.contains(tempStr))
		{
			idx = al.indexOf(tempStr);
			System.out.println(" " + idx + " : " + al.get(idx));
		}
		else
		{
			System.out.println(" nothing found");
		}
		
		System.out.println();
		
		// #3. delete by value
		System.out.print("delete >> ");
		tempStr = sc.nextLine();
		idx = 0;
		if(al.contains(tempStr))
		{
			idx = al.indexOf(tempStr);
			al.remove(idx);
		}
		else
		{
			System.out.println(" nothing found");
		}
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(" " + i + " : " + al.get(i));
		}
		
		System.out.println();
		
		// #4. delete all
		System.out.println("delete all");
		al.removeAll(al);
		
		if(al.isEmpty())
		{
			System.out.println(" list is empty");
		}
		else
		{
			for(int i=0; i<al.size(); i++)
			{
				System.out.println(" " + i + " : " + al.get(i));
			}
		}
		
		// #5. iterator
		Iterator<String> iter = al.iterator();
	
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}
}
