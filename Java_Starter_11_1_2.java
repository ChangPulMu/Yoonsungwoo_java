
public class Java_Starter_11_1_2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "990208-1012752";
		
		StringBuilder st = new StringBuilder(str);
		st = st.deleteCharAt(6);
		str = st.toString();
		
		System.out.println(str);
	}
}
