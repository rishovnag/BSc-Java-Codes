import java.io.*;
class capital
{
		public static void main(String args[])throws IOException
		{
		String file1,file2;
		
		int ch,n,nc;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter Input File name=");
		file1=br.readLine();
		System.out.print("Enter Output File name=");
		file2=br.readLine();
		RandomAccessFile fp1=new RandomAccessFile(file1,"rw");
		n=nc=0;
			while((ch=fp1.read())!=-1)
			{
			n++;
				if(ch>=97 && ch<=122)
				{
				ch=ch-32;
				fp1.seek(n-1);
				fp1.write(ch);
				nc++;
				}
			}
		fp1.close();
		System.out.println("\nNumber of Bytes in "+file1+"="+n+"Bytes");
		System.out.println("\nNumber of Bytes Modified "+nc);
		}
}