import java.util.Scanner;

public class Java_Starter_13_2_1
{
	static Scanner sc = new Scanner(System.in);
	
	public static void addTwoDArr(int[][] arr, int add)
	{
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j] += add;
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int col;
		
		System.out.print("배열 몇 개를 만드시겠습니까? ");
		col = sc.nextInt();
		
		int[] row = new int[col];
		
		for(int i=0;i<col;i++)
		{
			System.out.print((i+1)+"번 째 배열의 크기? ");
			row[i] = sc.nextInt();
		}
		
		int[][] array = new int[col][];
		
		for(int i=0;i<col;i++)
			array[i] = new int[row[i]];
		
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print((i+1)+"번 째 배열의 "+(j+1)+"번 째 요소의 값 입력 : ");
				array[i][j] = sc.nextInt();
			}
		
		addTwoDArr(array,7);
		
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
				System.out.println((i+1)+"번 째 배열의 "+(j+1)+"번 째 요소의 값 : "+array[i][j]);
	}
}
