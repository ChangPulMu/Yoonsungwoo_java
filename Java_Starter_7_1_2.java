class Child
{
	int ball;
	
	public Child(int b)
	{
		ball = b;
	}
	
	public void win(Child chd, int b)
	{
		chd.lose(b);
		ball += b;		// int remain = chd.lose(b);	ball += remain;
	}
	
	public void lose(int b)		// 구슬이 다 떨어졌을 때에 대한 예외처리 부족
	{
		ball -= b;
	}
	
	/*public int lose(int b)
	 *{
	 *		if(ball<b)
	 *		{
	 *				int remain = ball;
	 *				ball = 0;
	 *				return remain;
	 *		}
	 *
	 *		ball -= b;
	 *		return b;
	 *}
	 */
	
	public void showYourBall()
	{
		System.out.println("구슬 갯수 : " + ball);
	}
}

public class Java_Starter_7_1_2 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Child ch1 = new Child(15);
		Child ch2 = new Child(9);
		
		ch1.win(ch2, 2);
		ch2.win(ch1, 7);
		
		ch1.showYourBall();
		ch2.showYourBall();
	}
}
