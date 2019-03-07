class AdderThread extends Thread
{
	int num, start, end;
	
	public AdderThread(int s, int e)
	{
		num=0;
		start=s;
		end=e;
	}
	
	public void addNum(int n)
	{
		num+=n;
	}
	
	public int getNum()
	{
		return num;
	}
	
	public void run()
	{
		for(int i=start; i<=end; i++)
			addNum(i);
	}
}

public class Java_Starter_23_1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		
		at1.start();
		at2.start();
		
		try
		{
			at1.join();
			at2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("1부터 100까지의 합 : "+(at1.getNum()+at2.getNum()));
	}
}
