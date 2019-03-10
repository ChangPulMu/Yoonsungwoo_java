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
			System.out.println("Birthday : 입력되지 않음");
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
		
		while(true)		// Scanner, 메뉴 기능, 데이터 입력 기능 static 및 캡슐화가 좋은 코드!
		{
			System.out.println("\n선택하세요...");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 프로그램 종료\n");
			
			System.out.print("선택 : ");
			num = sc.nextInt();
			sc.nextLine();
			
			if(num==2)
			{
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else if(num==1)
			{
				System.out.print("이름 : ");
				String n = sc.nextLine();
				System.out.print("전화번호 : ");
				String p = sc.nextLine();
				System.out.print("생년월일 : ");
				String b = sc.nextLine();
				
				pi = new PhoneInfo2(n, p, b);
				
				System.out.println("\n입력된 정보 출력...");
				pi.showPhoneInfo2();
			}
			else
				System.out.println("잘못된 입력입니다");
		}
	}
}
