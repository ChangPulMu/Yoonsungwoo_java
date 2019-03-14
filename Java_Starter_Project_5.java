import java.util.Scanner;

interface MENU
{
	static final int INPUT=1, SEARCH=2, DELETE=3, EXIT=4;
}

interface MENU_INPUT
{
	static final int NORMAL=1, UNIV=2, COMP=3;
}

class PhoneInfo5
{
	private String name;
	private String phoneNumber;
	
	public PhoneInfo5(String n, String pN)
	{
		name = n;
		phoneNumber = pN;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void showPhoneInfo5()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
	}
}

class PhoneUnivInfo5 extends PhoneInfo5
{
	private String major;
	private int year;
	
	public PhoneUnivInfo5(String n, String p, String m, int y)
	{
		super(n, p);
		major = m;
		year = y;
	}
	
	public void showPhoneInfo5()
	{
		super.showPhoneInfo5();
		System.out.println("Major : "+major);
		System.out.println("Year : "+year);
	}
}

class PhoneCompanyInfo5 extends PhoneInfo5
{
	private String company;
	
	public PhoneCompanyInfo5(String n, String p, String c)
	{
		super(n, p);
		company = c;
	}
	
	public void showPhoneInfo5()
	{
		super.showPhoneInfo5();
		System.out.println("Company : "+company);
	}
}

class PhoneBookManager5
{
	static Scanner sc = new Scanner(System.in);
	PhoneInfo5[] pi = new PhoneInfo5[100];
	int count=0, choice;
	public static PhoneBookManager5 exist=null;	// �ν��Ͻ� �ߺ������� ����
	
	public static PhoneBookManager5 makePhoneBookManager5()	// �ν��Ͻ� �ߺ����� ���� �޼ҵ�
	{
		if(exist==null)
			return new PhoneBookManager5();
		else
			return exist;
	}
	
	public void inputPhoneInfo5()
	{
		System.out.println("������ �Է��� �����մϴ�...");
		System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
		System.out.print("����>> ");
		choice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("�̸� : ");
		String n = sc.nextLine();
		System.out.print("��ȭ��ȣ : ");
		String p = sc.nextLine();
		
		switch(choice)
		{
		case MENU_INPUT.NORMAL:
			pi[count++] = new PhoneInfo5(n, p);
			break;
			
		case MENU_INPUT.UNIV:
			System.out.print("���� : ");
			String m = sc.nextLine();
			System.out.print("�г� : ");
			int y = sc.nextInt();
			sc.nextLine();
			
			pi[count++] = new PhoneUnivInfo5(n, p, m, y);
			break;
			
		case MENU_INPUT.COMP:
			System.out.print("ȸ�� : ");
			String c = sc.nextLine();
			
			pi[count++] = new PhoneCompanyInfo5(n, p, c);
			break;
		}
		
		System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void searchPhoneInfo5()
	{
		System.out.println("������ �˻��� �����մϴ�...");
		
		System.out.print("�̸� : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
				pi[i].showPhoneInfo5();
		}
		
		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deletePhoneInfo5()
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

public class Java_Starter_Project_5
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

		PhoneBookManager5 pm = PhoneBookManager5.makePhoneBookManager5();
		
		while(true)
		{
			menu();
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num)
			{
			case MENU.INPUT:
				pm.inputPhoneInfo5();
				break;
			case MENU.SEARCH:
				pm.searchPhoneInfo5();
				break;
			case MENU.DELETE:
				pm.deletePhoneInfo5();
				break;
			case MENU.EXIT:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}
