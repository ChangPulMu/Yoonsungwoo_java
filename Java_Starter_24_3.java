import java.io.*;

public class Java_Starter_24_3 
{
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("printf.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter out = new PrintWriter(bw);
		
		out.printf("제 나이는 %d살 입니다.", 24);
		out.println("");
		
		out.println("저는 자바가 좋습니다.");
		out.print("특히 I/O 부분에서 많은 매력을 느낍니다.");
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
