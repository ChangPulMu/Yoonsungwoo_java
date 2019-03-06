interface Computer
{
	public abstract void dataReceive();
}

interface TV
{
	public abstract void onTV();
}

class IPTV implements Computer, TV
{
	public void dataReceive()
	{
		System.out.println("영상 데이터 수신 중");
	}
	
	public void onTV()
	{
		System.out.println("영상 출력 중");
	}
	
	public void powerOn()
	{
		dataReceive();
		onTV();
	}
}

public class Java_Starter_17_1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = iptv;
		Computer comp = iptv;
	}
}
