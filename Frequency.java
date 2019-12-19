import java.util.Scanner;
class Frequency{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string: ");
	String s=sc.nextLine();
	char c[]=s.toCharArray();
	int i;
	int count=0;
	System.out.println("enter any char");
	char c1=sc.next().charAt(0);
	for(i=0;i<c.length;i++)
	{
		if(c[i]==c1)          //There is no ignore cases
		{
		count+=1;
		}
		
	
	}
	
	
	if(count==0)
	{
		System.out.println("char not present in given string");
	}
	else
	{
		System.out.println("Frequency of "+ c1+" is "+count);
	}
}	
}
/*
output
enter string: 
github
enter any char
g
Frequency of g is 1

enter string: 
github
enter any char
r
char not present in given string
*/




