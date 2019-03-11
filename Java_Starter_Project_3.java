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
			System.out.println("Birthday : 입력되지 않음");
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
		System.out.println("데이터 입력을 시작합니다...");
		
		System.out.print("이름 : ");
		String n = sc.nextLine();
		System.out.print("전화번호 : ");
		String p = sc.nextLine();
		System.out.print("생년월일 : ");
		String b = sc.nextLine();
		
		pi[count] = new PhoneInfo3(n, p, b);	// count++ 이렇게 줄일 수 있음
		count++;
		
		System.out.println("데이터 입력이 완료되었습니다.");
	}
	
	public void searchPhoneInfo3()
	{
		System.out.println("데이터 검색을 시작합니다...");
		
		System.out.print("이름 : ");
		String n = sc.nextLine();
		
		for(int i=0;i<count;i++)
		{
			if(n.compareTo(pi[i].getName())==0)
				pi[i].showPhoneInfo3();
		}
		
		System.out.println("데이터 검색이 완료되었습니다.");
	}
	
	public void deletePhoneInfo3()
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

public class Java_Starter_Project_3
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
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
}
