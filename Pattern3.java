import java.util.Scanner;
class Pattern3
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no.of rows: ");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<n-i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
/*
enter no.of rows: 
5
* * * * * 
* * * * 
* * * 
* * 
* 
*/

