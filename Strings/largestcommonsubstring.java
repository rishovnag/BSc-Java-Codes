import java.io.*;
class largest_common {
public static void main(String args[])throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println(" Enter the first string ");
	String s1=br.readLine();
	System.out.println(" Enter the second string ");
	String s2=br.readLine();
	String z="";
	int max=0,i,j;
	for(i=0;i<s1.length();i++)
	{
		for(j=s1.length();j>=i;j--)
		{
			if(s2.indexOf(s1.substring(i, j))!=-1)
			{
				if(max<s1.substring(i,j).length())
				{
					max=s1.substring(i,j).length();
					z=s1.substring(i,j);
				}
			}
		}
	}
	System.out.println("The largest substring = "+z);
}
}
