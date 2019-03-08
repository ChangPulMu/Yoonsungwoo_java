import java.io.*;

public class Java_Starter_24_3 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("printf.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		
		out.printf("�� ���̴� %d�� �Դϴ�.", 24);
		out.println("");
		
		out.println("���� �ڹٰ� �����ϴ�.");
		out.print("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
		out.close();
		
		FileReader fr = new FileReader("printf.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String st;
		
		while(true)
		{
			st = br.readLine();
			
			if(st==null)
				break;
			
			System.out.println(st);
		}
		
		br.close();

	}
}
