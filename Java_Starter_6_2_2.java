
public class Java_Starter_6_2_2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
			if(prime(i))
				System.out.println(i);
	}

	public static boolean prime(int num)
	{
		if(num==1)
			return false;
		
		for(int tmp=2;tmp<num;tmp++)
			if(num%tmp==0)
				return false;
		
		return true;
	}
}
