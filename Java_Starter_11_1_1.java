
public class Java_Starter_11_1_1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String str = "ABCDEFGHIJKLMN";
		
		StringBuilder st = new StringBuilder(str);
		st = st.reverse();
		str = st.toString();
		
		System.out.println(str);
	}
}
