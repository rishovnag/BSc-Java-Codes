import java.io.*;
class TYPE
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileInputStream f1=new FileInputStream(args[0]);
		int ch;
		while((ch=f1.read())!=-1)
		{
			if(ch==32)
				System.out.print(" ");
			else if(ch==10)
				System.out.println();
			else if(ch==9)
				System.out.print("        ");
			else 
				System.out.print((char)ch);
		}
		f1.close();
		
	}
}