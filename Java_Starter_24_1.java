import java.io.*;
import java.util.Scanner;

class MyInfo
{
	String info;
	
	public MyInfo(String info)
	{
		this.info=info;
	}
	
	public String toString()
	{
		return info;
	}
}

public class Java_Starter_24_1
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		OutputStream op = new FileOutputStream("println.txt");
		PrintStream ps = new PrintStream(op);
		
		MyInfo mInfo = new MyInfo("���� �ڹ� ���α׷����Դϴ�.");
		
		ps.println("�� �Ұ��� �ϰڽ��ϴ�.");
		ps.println(mInfo);
		ps.printf("���� %d, ������ %dkg�Դϴ�.", 24, 72);
		
		ps.close();
	}
}
