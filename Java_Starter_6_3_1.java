
public class Java_Starter_6_3_1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(power(10));
	}

	public static int power(int n)
	{
		if(n==0)
			return 1;
		else
			return 2*power(--n);
	}
}
