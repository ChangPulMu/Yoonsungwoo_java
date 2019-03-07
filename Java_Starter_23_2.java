import java.util.Scanner;

interface Number
{
	public final static int NUM=5;
}

class Calculate
{
	private int num;
	boolean isStored=false;
	
	public void setNum(int n)
	{
		synchronized(this)
		{
			if(isStored==true)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			num=n;
			isStored=true;
			notify();
		}
	}
	
	public int getNum()
	{
		int gnum;
		
		synchronized(this)
		{
			if(isStored==false)
			{
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			isStored=false;
			gnum=num;
			notify();
		}
		return gnum;
	}
}

class CalculateThread extends Thread
{
	private Calculate c = new Calculate();
	int sum;
	
	public CalculateThread(Calculate c)
	{
		this.c = c;
	}
	
	public void run()
	{
		for(int i=0;i<Number.NUM;i++)
		{
			sum += c.getNum();
			System.out.println(i+"¹ø Â° °ª : "+sum);
		}
		
		System.out.println("ÃÑ ÇÕ : "+sum);
	}
}

public class Java_Starter_23_2 
{
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Calculate c = new Calculate();
		CalculateThread ct = new CalculateThread(c);
		ct.start();
		
		for(int i=0;i<Number.NUM;i++)
			c.setNum(sc.nextInt());
	}
}
