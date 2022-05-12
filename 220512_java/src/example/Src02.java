package example;



import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Src02 {

	public static void main(String[] args) {
		
		String path = "./txt/Src02.dat";
		String randStr = "123가나다asd";
		
		MiscClass misc = new MiscClass();
		
		try
		{
			//	output to path
			DataOutputStream output = new DataOutputStream(new FileOutputStream(path));
			
			output.writeUTF(randStr);
			
			output.writeInt(1);
			output.writeByte(2);
			output.writeShort(3);
			output.writeBoolean(true);
			output.writeChar('c');
			output.writeFloat(3.14f);
			output.writeDouble(234.567);
		
			//	input from path
			DataInputStream input = new DataInputStream(new FileInputStream(path));
			
			System.out.println(input.readUTF());
			
			System.out.print(input.readInt());
			System.out.print(input.readByte());
			System.out.print(input.readShort());
			System.out.print(input.readBoolean());
			System.out.print(input.readChar());
			System.out.print(input.readFloat());
			System.out.print(input.readDouble());
			
			input.close();
			output.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class MiscClass
{
	int datA = 0;
	boolean datB = true;
	String datC = null;
}
