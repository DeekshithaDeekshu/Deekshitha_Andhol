//Java program by Deekshitha on 27-Aug-2019
//Java Program to print pyramid of * to the given number of rows.
import java.util.Scanner;
class PyramidPattern
{
    public static void main(String args[])
    {
        int i, j,k, rows;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        rows = scan.nextInt();
        for(i=1; i<=rows; i++)
        {
            for(j=0,k=0; j<rows*i-1; j++,k++)
            {
		if(j<=rows-i)
                System.out.print("  ");
            
           	 else if(k<(2*i-1))
            
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
	