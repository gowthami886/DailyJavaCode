import java.util.Scanner;
class WordCount{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any string: ");
	String str1=sc.nextLine();
	String str=str1.trim();
	int i,count=1;
	char c[]=str.toCharArray();
	if(str.length()!=0)
	{
		for(i=0;i<str.length();i++)
		{	
			if(c[i]==' ' && c[i+1]!=' ')
			{
			count++;
			}	
		}
		System.out.println("Number of words in a given string is: "+count);
	}
	else
	{
		System.out.println("0 words");
	}
   }
}
/*
output 
enter any string: 

0 words
enter any string: 
hello gowthami gowd
Number of words in a given string is: 3
*/



