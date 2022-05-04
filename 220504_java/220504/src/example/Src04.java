package example;
import java.util.ArrayList;
import java.util.Iterator;

public class Src04
{
	public static void main(String[] args)
	{
		/*
		 * // #1. basic type of ArrayList is <Object>. ArrayList<Object> list = new
		 * ArrayList<Object>(); Nothing n = new Nothing();
		 * 
		 * list.add(5); list.add(3.14f); list.add(true); list.add('c');
		 * list.add("strstr"); list.add(n);
		 * 
		 * for(int i=0; i<list.size(); i++) { Object temp = list.get(i); String tempStr
		 * = temp.getClass().toString(); System.out.println(tempStr + " : " + temp); }
		 */
		
		// #2. Generic array list <String>
		// < > 안에는 wrapper class name을 사용.
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		ArrayList<String> arrStr = new ArrayList<String>();
		ArrayList<Character> arrChar = new ArrayList<Character>();
		ArrayList<Nothing> arrNot = new ArrayList<Nothing>();
		
		for(int i=0; i<3; i++)
		{
			arrNot.add(new Nothing());
		}
		
		for(int i=0; i<arrNot.size(); i++)
		{
			System.out.println(arrNot.get(i).a + ", " + arrNot.get(i).b);
		}

		System.out.println();
		
		// #3. Generic Class Something<T>
		Something<Nothing> st1 = new Something<Nothing>(new Nothing());
		Something<Integer> st2 = new Something<Integer>(Integer.valueOf(10));
		MoreThing<Integer, Nothing> st3 = new MoreThing<Integer, Nothing>(Integer.valueOf(99), new Nothing());
		
		System.out.println(st1.getClass().toString() + " :  " + st1.get());
		System.out.println(st2.getClass().toString() + " :  " + st2.get());
		System.out.println(st3.getClass().toString() + " :  " + st3.getFirst() + ", " + st3.getSecond());
		
		ArrayList<Nothing> arr = new ArrayList<Nothing>();
		arr.add(new Nothing());
		arr.add(new Nothing());
		arr.add(new Nothing());
		
		System.out.println();
		
		// + Iterator, hasNext(), next()
		System.out.println("Iterator.next()");
		Iterator iter = arr.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}

class Nothing
{
	int a;
	int b;
	
	Nothing()
	{
		this.a = 0;
		this.b = 0;
	}
	
	Nothing(int _a, int _b)
	{
		this.a = _a;
		this.b = _b;
	}
	
	public String toString()
	{
		return a + ", " + b;
	}
}

class Something<T>
{
	private T element;
	
	Something(T _smth)
	{
		set(_smth);
	}
	
	void set(T _smth)
	{
		this.element = _smth;
	}
	
	T get()
	{
		return element;
	}
	
}

class MoreThing<T1, T2>
{
	private T1 elemA;
	private T2 elemB;
	
	MoreThing(T1 _t1, T2 _t2)
	{
		this.elemA = _t1;
		this.elemB = _t2;
	}
	
	void set(T1 _t1, T2 _t2)
	{
		this.elemA = _t1;
		this.elemB = _t2;
	}
	
	T1 getFirst()
	{
		return this.elemA;
	}
	
	T2 getSecond()
	{
		return this.elemB;
	}
}
