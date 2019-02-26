
public class Java_Starter_4_1_5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int A = ((25+5)+(36/4)-72)*5;
		int B = ((25*5)+(36-4)+71)/4;
		int C = (128/4)*2;
		
		if((A>B)&&(B>C))	// 조건 부분을 boolean변수에 저장해 그 변수 값을 출력하는 방법이 더 간결
			System.out.println("true");
		else
			System.out.println("false");
	}

}
