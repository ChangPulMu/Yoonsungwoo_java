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
		
		System.out.print("�迭 �� ���� ����ðڽ��ϱ�? ");
		col = sc.nextInt();
		
		int[] row = new int[col];
		
		for(int i=0;i<col;i++)
		{
			System.out.print((i+1)+"�� ° �迭�� ũ��? ");
			row[i] = sc.nextInt();
		}
		
		int[][] array = new int[col][];
		
		for(int i=0;i<col;i++)
			array[i] = new int[row[i]];
		
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print((i+1)+"�� ° �迭�� "+(j+1)+"�� ° ����� �� �Է� : ");
				array[i][j] = sc.nextInt();
			}
		
		addTwoDArr(array,7);
		
		for(int i=0;i<array.length;i++)
			for(int j=0;j<array[i].length;j++)
				System.out.println((i+1)+"�� ° �迭�� "+(j+1)+"�� ° ����� �� : "+array[i][j]);
	}
}
