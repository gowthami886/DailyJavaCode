import java.util.Scanner;
class Maximum{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter no of elements");
	int n=sc.nextInt();
	int array[]=new int[n]; 
	int i,max=array[0];
	System.out.println("enter element to insert");
	for(i=0;i<array.length;i++)
		{
	 	array[i]=sc.nextInt();
		}
	
	for(i=0;i<array.length;i++)
	{
		if (array[i]>max)
			{
			max=array[i];
			}
	}
	System.out.println("Maximum element in given array:"+ max);
	
	}
}

/*
input:
10 12 3 4 5
output:
Maximum element in given array:12
*/

