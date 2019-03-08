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
		
		MyInfo mInfo = new MyInfo("저는 자바 프로그래머입니다.");
		
		ps.println("제 소개를 하겠습니다.");
		ps.println(mInfo);
		ps.printf("나이 %d, 몸무게 %dkg입니다.", 24, 72);
		
		ps.close();
	}
}
