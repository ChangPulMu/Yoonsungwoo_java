
public class Java_Starter_5_7_2
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int a=0;a<10;a++)
			for(int b=0;b<10;b++)
			{
				int num1 = 10*a + b, num2 = 10*b + a;
				
				if(num1+num2==99)
					System.out.println(num1 + ", " + num2);
			}
	}

}
