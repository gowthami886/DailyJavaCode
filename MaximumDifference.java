import java.util.Scanner;
class MaximumDifference
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array length: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	int i,j,max=0;
	System.out.println("enter elements: ");
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{ 
			int dif=a[j]-a[i];
			if(dif>max)
			{
				max=dif;
			}
		}
		
	}
	System.out.println("Maximum difference is: "+max);
	}
}
/*
output
enter array length: 
7
enter elements: 
2 3 10 6 4 8 1 
Maximum difference is: 8
*/
	
