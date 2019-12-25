import java.util.Scanner;
class Vowels
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any string: ");
	String str=sc.nextLine();
	char c[]=str.toCharArray();
	int i,count=0;
	for(i=0;i<c.length;i++)
	{
		if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u')
		{
		count++;
		}
	}
	if(count==0)
	{
	System.out.println("There is no vowels in a given string");
	}
	else
	{
	System.out.println("Number of vowels count in a given string: "+count);
	}
	}
}
/*
output
enter any string: 
gowthami gowd
Number of vowels count in a given string: 4

enter any string: 
wrtylk
There is no vowels in a given string
*/





