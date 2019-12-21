import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}
}
/*
enter n value
5
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
*/
