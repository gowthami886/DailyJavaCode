import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array length");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter array elements");
	int low=0,high=n-1,temp,i;
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	while(low<high)
	{
	temp=a[low];
	a[low]=a[high];
	a[high]=temp;
	low++;
	high--;
	}
	for(i=0;i<n;i++)
	{
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
}
/*
output:
enter array length
4
enter array elements
1 2 3 4
4 3 2 1 
*/
			
