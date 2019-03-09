class PhoneInfo
{
	private String name;
	private String phoneNumber;
	private String birthday;
	
	public PhoneInfo(String n, String pN)
	{
		name = n;
		phoneNumber = pN;
	}
	
	public PhoneInfo(String n, String pN, String bd)
	{
		this(n, pN);
		birthday = bd;
	}
	
	public void showPhoneInfo()
	{
		System.out.println("Name : "+name);
		System.out.println("Phone Number : "+phoneNumber);
		if(birthday==null)
			System.out.println("Birthday : 입력되지 않음");
		else
			System.out.println("Birthday : "+birthday);
	}
}

public class Java_Starter_Project_1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PhoneInfo pi1 = new PhoneInfo("두두", "010-9348-5281", "970117");
		PhoneInfo pi2 = new PhoneInfo("송송", "010-0348-5282");
		
		pi1.showPhoneInfo();
		pi2.showPhoneInfo();
	}
}
