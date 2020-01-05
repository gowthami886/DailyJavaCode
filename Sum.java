import java.util.*;
class Sum
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.of test cases: ");
	int n=sc.nextInt();
	int i,sum;
	for(i=0;i<n;i++)
	{	
		System.out.println("enter number");
		int x=sc.nextInt();
		sum=x%10;
		while(x>=10)
		{
			x=x/10;
		}
		sum+=x;
		System.out.println("Sum of first and last digit: "+sum);
	}
	}
}
/*
output:
Enter no.of test cases: 
3
enter number
123
Sum of first and last digit: 4
enter number
3456
Sum of first and last digit: 9
enter number
000
Sum of first and last digit: 0
*/

