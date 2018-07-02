import java.io.*;
class pattern_find {
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the original string : ");
		String s=br.readLine();
		System.out.println("Enter the pattern you want to find : ");
		String p=br.readLine();
		System.out.println("Enter the position from where you want to search the string for the pattern : ");
		int n=Integer.parseInt(br.readLine());
		int pos=strcmp(n,p,s);
		if(pos==-1)
			System.out.println(" The pattern is not found ");
		else
			System.out.println(" The first occurrence of the string is at index = "+pos);
		}
	static int strcmp(int n,String p,String s)
	{
		int count=0,i,ls,lp;
		ls=s.length();
		lp=p.length();
		int flag=0,pos=-1;
		String tmp="";
		if(ls<lp)
		{
			System.err.println("Pattern can't be greater than original string..");
			System.exit(0);
		}
		if(n>=ls)
		{
			System.err.println("Index out of bounds..");
			System.exit(0);	
		}
		for(i=0;i<ls-lp;i++)
		{
			tmp=s.substring(i,(i+lp));
			if(p.equals(tmp)==true)
			{
				if(flag==0)
			    {
				 pos=i;
				 flag=1;
			    }
				count++;
		    }
		}
		if(flag==0)
		return -1;
		else
		{
		System.out.println(" The pattern "+p+" is present "+count+" times in the string "+s);
		return pos;
	   }
   }
}
