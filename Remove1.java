import java.util.Scanner;
class Remove
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter array length: ");
	int n=sc.nextInt();
	int arr[]=new int[n];
	int len=arr.length;
	int i,j=0;
	System.out.println("Enter sorted array elements: ");
	for(i=0;i<len;i++)
	{
		arr[i]=sc.nextInt();
	}
	for( i=0;i<len-1;i++)
	{
		if(arr[i]!=arr[i+1])
		{
			arr[j]=arr[i];
			j++;
		}
	}
	arr[j++]=arr[len-1];
	System.out.println("After sorting: ");
	for(i=0;i<j;i++)
	{
		System.out.println(arr[i]);
	}
	}
}
