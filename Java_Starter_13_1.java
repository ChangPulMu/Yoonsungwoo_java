import java.util.Scanner;

public class Java_Starter_13_1
{
	static Scanner sc = new Scanner(System.in);
	
	public static int minValue(int[] arr)
	{
		int tmp = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(tmp>arr[i])
				tmp = arr[i];
		}
		
		return tmp;
	}
	
	public static int maxValue(int[] arr)
	{
		int tmp = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(tmp<arr[i])
				tmp = arr[i];
		}
		
		return tmp;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num;
		
		System.out.print("몇 개의 정수를 입력하겠습니까? ");
		num = sc.nextInt();
		sc.nextLine();
		
		int[] array = new int[num];
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print((i+1)+"번 째 정수 입력 : ");
			array[i] = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("가장 큰 값 : "+maxValue(array));
		System.out.println("가장 작은 값 : "+minValue(array));
	}
}
