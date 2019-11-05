import java.util.Scanner;
class BubbleSort
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter no of elements: ");
	int n=s.nextInt();
	int array[]=new int[n];
	int i,j;
	System.out.println("enter "+n+" elements to insert:");
	for(i=0;i<array.length;i++)
	{
		array[i]=s.nextInt();
	}
	for(i=0;i<array.length-1;i++)
	{
		int temp;
		for(j=i+1;j<array.length;j++)
		{
			if(array[i]>array[j])
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println("Ascending order:");
	for(i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	
	}
}
			
