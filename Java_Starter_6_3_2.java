
public class Java_Starter_6_3_2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		binary(20);
	}

	public static void binary(int num)
	{
		if(num==1)
			System.out.print(1);
		else
		{
			binary(num/2);
			System.out.print(num%2);
		}
	}
}
