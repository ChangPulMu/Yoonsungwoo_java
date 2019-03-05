import java.util.Scanner;

public class Java_Starter_13_2_2
{
	public static void changeArray(int[][] arr) // 위에서 내려오면서 바꾸는 것이 변수 하나 덜쓰고 코드도 짧음
	{
		int[] tmp, next=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			tmp = arr[i];
			arr[i] = next;
			next = tmp;
		}
		
		arr[0] = next;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[][] array = {
				{1,2,3,4},
				{10,20,30},
				{100}
		};
		
		changeArray(array);
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array[i].length;j++)
				System.out.print(array[i][j]+" ");
			System.out.println("");
		}
	}
}
