import java.util.Scanner;

class PhoneInfo2
{
	private String name;
	private String phoneNumber;
	private String birthday;
	
	public PhoneInfo2(String n, String pN)
	{
		name = n;
		phoneNumber = pN;
	}
	
	public PhoneInfo2(String n, String pN, String bd)
	{
		this(n, pN);
		birthday = bd;
	}
	
	public void showPhoneInfo2()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
		if(birthday==null)
			System.out.println("Birthday : �Էµ��� ����");
		else
			System.out.println("Birthday : "+birthday);
	}
}

public class Java_Starter_Project_2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		PhoneInfo2 pi;
		
		while(true)		// Scanner, �޴� ���, ������ �Է� ��� static �� ĸ��ȭ�� ���� �ڵ�!
		{
			System.out.println("\n�����ϼ���...");
			System.out.println("1. ������ �Է�");
			System.out.println("2. ���α׷� ����\n");
			
			System.out.print("���� : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if(num==2)
			{
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			else if(num==1)
			{
				System.out.print("�̸� : ");
				String n = sc.nextLine();
				System.out.print("��ȭ��ȣ : ");
				String p = sc.nextLine();
				System.out.print("������� : ");
				String b = sc.nextLine();
				
				pi = new PhoneInfo2(n, p, b);
				
				System.out.println("\n�Էµ� ���� ���...");
				pi.showPhoneInfo2();
			}
			else
				System.out.println("�߸��� �Է��Դϴ�");
		}
	}
}
