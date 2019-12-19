import java.util.Scanner;
class Search{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string: ");
	String s=sc.nextLine();
	char c[]=s.toCharArray();
	int i;
	int flag=0;
	System.out.println("enter which char do you want to search: ");
	char c1=sc.next().charAt(0);
	for(i=0;i<c.length;i++)
	{
		if(c[i]==c1)          //There is no ignore cases
		{
		flag=1;
		}
	
	}
	if(flag==0)
	{
		System.out.println(c1+" is not present in given string");
	}
	else
	{
		System.out.println(c1+" is present in given string");
	}
}	
}
