import java.util.Scanner;

class PhoneInfo3
{
	private String name;
	private String phoneNumber;
	private String birthday;
	
	public PhoneInfo3(String n, String pN)
	{
		name = n;
		phoneNumber = pN;
	}
	
	public PhoneInfo3(String n, String pN, String bd)
	{
		this(n, pN);
		birthday = bd;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void showPhoneInfo3()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
		if(birthday==null)
			System.out.println("Birthday : �Էµ��� ����");
		else
			System.out.println("Birthday : "+birthday);
	}
}

class PhoneBookManager3
{
	static Scanner sc = new Scanner(System.in);
	PhoneInfo3[] pi = new PhoneInfo3[100];
	int count=0;
	
	public void inputPhoneInfo3()
	{
		System.out.println("������ �Է��� �����մϴ�...");
		
		System.out.print("�̸� : ");
		String n = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String p = sc.nextLine();
		System.out.print("������� : ");
		String b = sc.nextLine();
		
		pi[count] = new PhoneInfo3(n, p, b);	// count++ �̷��� ���� �� ����
		count++;
		
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void searchPhoneInfo3()
	{
		System.out.println("������ �˻��� �����մϴ�...");
		
		System.out.print("�̸� : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
				pi[i].showPhoneInfo3();
		}
		
		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deletePhoneInfo3()
	{
		System.out.println("������ ������ �����մϴ�...");
		
		System.out.print("�̸� : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
			{
				for(int j=i+1;j<count;j++)
					pi[j-1] = pi[j];
				
				count--;
				System.out.println("������ ������ �Ϸ�Ǿ����ϴ�.");
			}
		}
	}
}

public class Java_Starter_Project_3
{	
	static Scanner sc = new Scanner(System.in);
	
	public static void menu()
	{
		System.out.println("\n�����ϼ���...");
		System.out.println("1. ������ �Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ���α׷� ����\n");
		System.out.print("���� : ");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;

		PhoneBookManager3 pm = new PhoneBookManager3();
		
		while(true)
		{
			menu();
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num)
			{
			case 1:
				pm.inputPhoneInfo3();
				break;
			case 2:
				pm.searchPhoneInfo3();
				break;
			case 3:
				pm.deletePhoneInfo3();
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
