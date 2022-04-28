package example;

// stack

public class Src03
{
	public static void main(String[] args)
	{
		Stack s = new ImpStack(5);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		System.out.println();
		
		System.out.println("pop(" + s.pop() + ")");
		System.out.println("pop(" + s.pop() + ")");
		System.out.println("pop(" + s.pop() + ")");
		System.out.println("pop(" + s.pop() + ")");
		System.out.println("pop(" + s.pop() + ")");
		System.out.println("pop(" + s.pop() + ")");
	}
}

interface Stack
{
	int DEFAULT_STACK_SIZE = 10;
	
	void push(int _val);
	int pop();
}

class ImpStack implements Stack
{
	int[] stack;
	int top;
	
	ImpStack()
	{
		stack = new int[DEFAULT_STACK_SIZE];
		top = 0;
	}
	
	ImpStack(int _size)
	{
		stack = new int[_size];
		top = 0;
	}
	
	public void push(int _val)
	{
		if(top == stack.length)
		{
			System.out.println("push(" + _val + ") unable : stack is full.");
			return;
		}
		else
		{
			System.out.println("push(" + _val + ")");
			stack[top++] = _val;	
		}
	}
	
	public int pop()
	{
		if(top == 0)
		{
			System.out.print("pop() unable : no item in the stack. ");
			return -1;
		}
		else
		{
			return stack[--top];			
		}
	}	
}