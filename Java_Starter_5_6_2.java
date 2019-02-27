
public class Java_Starter_5_6_2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num = 1, sum = 0;
		
		while(true)
		{
			if( (num%2) == 1 || (num%3) == 0 )
			{
				sum += num;
				if(sum>1000)
				{
					System.out.println(sum);
					break;
				}
			}
			num++;
		}
	}

}
