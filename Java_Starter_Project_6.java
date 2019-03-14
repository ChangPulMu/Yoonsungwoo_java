import java.util.Scanner;

interface MENU6
{
	static final int INPUT=1, SEARCH=2, DELETE=3, EXIT=4;
}

interface MENU_INPUT6
{
	static final int NORMAL=1, UNIV=2, COMP=3;
}

class MenuChoiceException extends Exception
{
	public MenuChoiceException()
	{
		super("�޴� ������ ó������ �ٽ� �����մϴ�.");
	}
	
	public void showException()
	{
		System.out.println("�� �ش��ϴ� ������ �������� �ʽ��ϴ�.");
	}
}

class PhoneInfo6
{
	private String name;
	private String phoneNumber;
	
	public PhoneInfo6(String n, String pN)
	{
		name = n;
		phoneNumber = pN;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void showPhoneInfo6()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
	}
}

class PhoneUnivInfo6 extends PhoneInfo6
{
	private String major;
	private int year;
	
	public PhoneUnivInfo6(String n, String p, String m, int y)
	{
		super(n, p);
		major = m;
		year = y;
	}
	
	public void showPhoneInfo6()
	{
		super.showPhoneInfo6();
		System.out.println("Major : "+major);
		System.out.println("Year : "+year);
	}
}

class PhoneCompanyInfo6 extends PhoneInfo6
{
	private String company;
	
	public PhoneCompanyInfo6(String n, String p, String c)
	{
		super(n, p);
		company = c;
	}
	
	public void showPhoneInfo6()
	{
		super.showPhoneInfo6();
		System.out.println("Company : "+company);
	}
}

class PhoneBookManager6
{
	static Scanner sc = new Scanner(System.in);
	PhoneInfo6[] pi = new PhoneInfo6[100];
	int count=0, choice;
	public static PhoneBookManager6 exist=null;	// �ν��Ͻ� �ߺ������� ����
	
	public static PhoneBookManager6 makePhoneBookManager6()	// �ν��Ͻ� �ߺ����� ���� �޼ҵ�
	{
		if(exist==null)
			return new PhoneBookManager6();
		else
			return exist;
	}
	
	public void inputPhoneInfo6()
	{
		try 
		{
			System.out.println("������ �Է��� �����մϴ�...");
			System.out.println("1. �Ϲ�, 2. ����, 3. ȸ��");
			System.out.print("����>> ");
			choice = sc.nextInt();
			sc.nextLine();
			
			if(choice<MENU_INPUT.NORMAL||choice>MENU_INPUT.COMP)
				throw new MenuChoiceException();
			
			System.out.print("�̸� : ");
			String n = sc.nextLine();
			System.out.print("��ȭ��ȣ : ");
			String p = sc.nextLine();
			
			switch(choice)
			{
			case MENU_INPUT.NORMAL:
				pi[count++] = new PhoneInfo6(n, p);
				break;
				
			case MENU_INPUT.UNIV:
				System.out.print("���� : ");
				String m = sc.nextLine();
				System.out.print("�г� : ");
				int y = sc.nextInt();
				sc.nextLine();
				
				pi[count++] = new PhoneUnivInfo6(n, p, m, y);
				break;
				
			case MENU_INPUT.COMP:
				System.out.print("ȸ�� : ");
				String c = sc.nextLine();
				
				pi[count++] = new PhoneCompanyInfo6(n, p, c);
				break;
			}
			
			System.out.println("������ �Է��� �Ϸ�Ǿ����ϴ�.");
			}
		catch(MenuChoiceException e)
		{
			System.out.print(choice);
			e.showException();
			System.out.println(e.getMessage());
		}
	}
	
	public void searchPhoneInfo6()
	{
		System.out.println("������ �˻��� �����մϴ�...");
		
		System.out.print("�̸� : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
				pi[i].showPhoneInfo6();
		}
		
		System.out.println("������ �˻��� �Ϸ�Ǿ����ϴ�.");
	}
	
	public void deletePhoneInfo6()
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

public class Java_Starter_Project_6
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
		int num = 0;

		PhoneBookManager6 pm = PhoneBookManager6.makePhoneBookManager6();
		
		while(true)
		{
			try 
			{
				menu();
				num = sc.nextInt();
				sc.nextLine();
				
				if(num<MENU.INPUT||num>MENU.EXIT)
					throw new MenuChoiceException();
				
				switch(num)
				{
				case MENU.INPUT:
					pm.inputPhoneInfo6();
					break;
				case MENU.SEARCH:
					pm.searchPhoneInfo6();
					break;
				case MENU.DELETE:
					pm.deletePhoneInfo6();
					break;
				case MENU.EXIT:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}
			}
			catch(MenuChoiceException e)
			{
				System.out.print(num);
				e.showException();
				System.out.println(e.getMessage());
			}
		}
	}
}
