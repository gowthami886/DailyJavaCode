import java.util.Scanner;
class LowerUpper
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.next();
	char c[]=s.toCharArray();
	int i;
	for(i=0;i<c.length;i++)
	{
		if(c[i]<91 && c[i]>64)
		{
		c[i]+=32;
		}
		else if(c[i]>96 && c[i]<123)
		{
		c[i]-=32;
		}
	}
	for(i=0;i<c.length;i++)
	{
		System.out.print(c[i]);
	}
	System.out.println();
	}
}
/*
output
enter string
hellogowthami
HELLOGOWTHAMI
*/
