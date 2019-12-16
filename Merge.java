import java.util.Scanner;
class Merge
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter 1st array length: ");
	int n=sc.nextInt();
	System.out.println("enter 2nd array length: ");
	int n1=sc.nextInt();
	int arr[]=new int[n];
	int arr1[]=new int[n1];
	int arr2[]=new int[n+n1];
	int i,j=0;
	System.out.println("enter  "+n+" sorted elements" );
	for(i=0;i<n;i++)
	{
	arr[i]=sc.nextInt();

	}
	System.out.println("enter "+n1+"  sorted elements" );
	for(i=0;i<n1;i++)
	{
	arr1[i]=sc.nextInt();
	}
	for(i=0;i<n;i++)
	{
		arr2[i]=arr[i];
	}
	for(i=n;i<n+n1;i++)
	{
	arr2[i]=arr1[j];
	j++;
	}
	System.out.println("After merging two arrays: ");
	for(i=0;i<n+n1;i++)
	{
		System.out.print(arr2[i]+" ");
	}
	System.out.println();
	
}
}
/*
output:

enter 1st array length: 
3      
enter 2nd array length: 
4
enter  3 sorted elements
1 2 3
enter 4  sorted elements
5 6 7 8
After merging two arrays: 
1 2 3 5 6 7 8 
*/


