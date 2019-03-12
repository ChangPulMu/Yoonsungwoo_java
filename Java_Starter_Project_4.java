import java.util.Scanner;

class PhoneInfo4
{
	private String name;
	private String phoneNumber;
	
	public PhoneInfo4(String n, String pN)
	{
		name = n;
		phoneNumber = pN;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void showPhoneInfo4()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
	}
}

class PhoneUnivInfo4 extends PhoneInfo4
{
	private String major;
	private int year;
	
	public PhoneUnivInfo4(String n, String p, String m, int y)
	{
		super(n, p);
		major = m;
		year = y;
	}
	
	public void showPhoneInfo4()
	{
		super.showPhoneInfo4();
		System.out.println("Major : "+major);
		System.out.println("Year : "+year);
	}
}

class PhoneCompanyInfo4 extends PhoneInfo4
{
	private String company;
	
	public PhoneCompanyInfo4(String n, String p, String c)
	{
		super(n, p);
		company = c;
	}
	
	public void showPhoneInfo4()
	{
		super.showPhoneInfo4();
		System.out.println("Company : "+company);
	}
}

class PhoneBookManager4
{
	static Scanner sc = new Scanner(System.in);
	PhoneInfo4[] pi = new PhoneInfo4[100];
	int count=0, choice;
	
	public void inputPhoneInfo4()
	{
		System.out.println("데이터 입력을 시작합니다...");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		choice = sc.nextInt();
		sc.nextLine();
		
		System.out.print("이름 : ");
		String n = sc.nextLine();
		System.out.print("전화번호 : ");
		String p = sc.nextLine();
		
		if(choice==1)
		{
			pi[count++] = new PhoneInfo4(n, p);
		}
		else if(choice==2)
		{
			System.out.print("전공 : ");
			String m = sc.nextLine();
			System.out.print("학년 : ");
			int y = sc.nextInt();
			sc.nextLine();
			
			pi[count++] = new PhoneUnivInfo4(n, p, m, y);
		}
		else if(choice==3)
		{
			System.out.print("회사 : ");
			String c = sc.nextLine();
			
			pi[count++] = new PhoneCompanyInfo4(n, p, c);
		}
		
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public void searchPhoneInfo4()
	{
		System.out.println("데이터 검색을 시작합니다...");
		
		System.out.print("이름 : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
				pi[i].showPhoneInfo4();
		}
		
		System.out.println("데이터 검색이 완료되었습니다.");
	}
	
	public void deletePhoneInfo4()
	{
		System.out.println("데이터 삭제를 시작합니다...");
		
		System.out.print("이름 : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
			{
				for(int j=i+1;j<count;j++)
					pi[j-1] = pi[j];
				
				count--;
				System.out.println("데이터 삭제가 완료되었습니다.");
			}
		}
	}
}

public class Java_Starter_Project_4
{	
	static Scanner sc = new Scanner(System.in);
	
	public static void menu()
	{
		System.out.println("\n선택하세요...");
		System.out.println("1. 데이터 입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 프로그램 종료\n");
		System.out.print("선택 : ");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;

		PhoneBookManager4 pm = new PhoneBookManager4();
		
		while(true)
		{
			menu();
			num = sc.nextInt();
			sc.nextLine();
			
			switch(num)
			{
			case 1:
				pm.inputPhoneInfo4();
				break;
			case 2:
				pm.searchPhoneInfo4();
				break;
			case 3:
				pm.deletePhoneInfo4();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
