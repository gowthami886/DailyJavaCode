import java.util.Scanner;
class StringPalindrome
{
	public static void main(String args[])
	{
	String s="gowthami";
	char[] c=s.toCharArray();
	char[] c1=new char[c.length];
	int i;
	int j=0,count=0;
	for(i=c.length-1;i>=0;i--)
	{
		c1[j]=c[i];
		j++;
	}
	for(i=0;i<c.length;i++)
	{
		if(c[i]!=c1[i])
		count++;
	}
	if(count>0)
	{
		System.out.println("Not Palindrome");
	}
	else
	{
		System.out.println("Palindrome");
	}
	
	}
}
/*
input:
gowthami
output:
Not Palindrome
input2:
hiih
output:
Palindrome
*/

	
	
	
	
	
	
	




