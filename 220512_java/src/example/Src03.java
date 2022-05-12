package example;

import java.io.Serializable;

import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.ObjectInputStream;

import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;

public class Src03
{
	public static void main(String[] args)
	{
		try
		{
			String path = "./txt/MemData.txt";
			
			ArrayList<Student> al = new ArrayList<Student>();
			al.add(new Student("aaa", 56, 45, 34));
			al.add(new Student("bbb", 99, 87, 65));
			al.add(new Student("ccc", 32, 65, 89));
			
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(path));
			ObjectInputStream input = new ObjectInputStream(new FileInputStream(path));
			
			//	write object in path
			for(int i = 0; i <al.size(); i++)
			{
				output.writeObject(al.get(i));
			}
			output.writeObject(null);
			
			//	read object from path
			Student tempStud = null;
			while(true)
			{
				if((tempStud = (Student)input.readObject()) != null)
				{
					System.out.println(tempStud);
				}
				else
				{
					break;
				}	
			}
			
			input.close();
			output.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}

class Student implements Serializable
{
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sum;
	private float avg;
	
	Student(){};
	
	Student(String _name, int _kor, int _eng, int _mat)
	{
		this.name = _name;
		this.kor = _kor;
		this.eng = _eng;
		this.mat = _mat;
		eval_sum();
		eval_avg();
	}
	
	void eval_sum()
	{
		this.sum = this.kor + this.eng + this.mat;
	}
	
	void eval_avg()
	{
		this.avg = this.sum / 3.0f;
	}

	public String toString()
	{
		String str = this.name + " / "  + this.kor + ", "  + this.eng + ", "  + this.mat + " / "  + this.sum + ", " + String.format("%.2f", this.avg);
		return str;
	}
	
}