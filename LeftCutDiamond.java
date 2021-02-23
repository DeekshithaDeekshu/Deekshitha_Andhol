import java.util.Scanner;
import java.util.Arrays;
class LeftCutDiamond
{
	public static void main(String[] args)
	{
		int rows,mid,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter number of rows(Odd numbers only): ");
		rows=sc.nextInt();
		mid=rows/2;
		for(int i=0;i<rows;i++)
		{
			if(i>mid)	
				pos++;
			for(int j=0;j<rows;j++)
			{
				if(i<=mid)
				{
					if(j<rows-i-1)
						System.out.print(" ");
					else
						System.out.print("*");
				
				}
				if(i>mid)
				{

					
					if(j>=pos)
						System.out.print("*");
					else
						System.out.print(" ");

				}
			}
			System.out.println();
		}


	}
}