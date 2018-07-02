	import java.io.*;
	class copy1
	{
		public static void main(String args[])throws IOException
		{
		String file1,file2;
		int ch,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter Input File name=");
		file1=br.readLine();
		System.out.print("Enter Output File name=");
		file2=br.readLine();
		FileInputStream fp1=new FileInputStream(file1);
		FileOutputStream fp2=new FileOutputStream(file2);
		n=0;
				while((ch=fp1.read())!=-1)
				{
				fp2.write(ch);
				n++;
				}
		fp1.close();
		fp2.close();
		System.out.println("\nNumber of byte copied to "+file1+"="+n);
		}
		
	}