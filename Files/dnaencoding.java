import java.io.*;
class q9bas2
{
	public static void main(String args[])throws IOException
	{
		int ch;
		char c;
		int i;
		String str,s;
		FileInputStream fp1=new FileInputStream(args[0]);
		FileOutputStream fp2=new FileOutputStream(args[1]);
		while((ch=fp1.read())!=-1)
		{
			str=binary(ch);
			System.out.println(str);
			for(i=0;i<8;i=i+2)
			{
				s="";
				c=str.charAt(i);
				s=s+c;
				c=str.charAt(i+1);
				s=s+c;
				System.out.println(s);
				if(s.equals("00"))
					c='A';
				if(s.equals("01"))
					c='T';
				if(s.equals("10"))
					c='C';
				if(s.equals("G"))
					c='G';
				fp2.write(c);
			}
		}
		fp1.close();
		fp2.close();
	}
	public static String binary(int ch)
	{
		int c=ch;
		int d,l;
		String str="";
		while(c>0)
		{
			d=c%2;
			c=c/2;
			str=Integer.toString(d)+str;
		}
		System.out.println(str);
		
		l=str.length();
		while(l<8)
		{
			str='0'+str;
			l++;
		}
		System.out.println(str);
		return str;
	}
}