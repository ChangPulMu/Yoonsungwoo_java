
public class Java_Starter_4_2_2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num = 15678;
		int check = 20;
		
		int checksum = num&check;
		
		if(checksum==20)
			System.out.println("�� ��°, �ټ� ��° ��Ʈ 1");
		else if(checksum==16)
			System.out.println("�ټ� ��° ��Ʈ 1");
		else if(checksum==4)
			System.out.println("�� ��° ��Ʈ 1");
		else if(checksum==0)
			System.out.println("�� ��°, �ټ� ��° ��Ʈ 0");
		/*System.out.println((num>>2) & 1)
		 *System.out.println((num>>4) & 1)
		 */
	}

}
