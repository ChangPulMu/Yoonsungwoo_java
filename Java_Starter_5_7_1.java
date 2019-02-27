
public class Java_Starter_5_7_1
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		for(int i=2;i<10;i+=2)
			for(int j=1;j<10;j++)
			{
				if(j>i)
					break;
				System.out.println(i + " * " + j + " = " + i*j);
			}
	}

}
