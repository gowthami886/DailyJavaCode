class SS
{
	public static void main(String args[])
	{
	String arr="gowthamigowd";
	char c[]=arr.toCharArray();
	int i,j;
	int count=0;
	for(i=0;i<c.length;i++)
	{
		for(j=i+1;j<c.length;j++)
		{
			if(c[i]==c[j])
			{	
				count++;
			
			
			}
			
		}
	
	}
	if(count==0)
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
			
	}
}

/*input1:
gowthami
output:
True
iput2:
gowthamigowd
output:
False
*/

