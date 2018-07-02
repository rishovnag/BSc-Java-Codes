import java.io.*;
class transfer
{
	public static void main(String args[])throws IOException
	{
	String file1,file2;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 	int n,ch,ch1;
	System.out.print("\nEnter Input File Name=");
	file1=br.readLine();
	System.out.print("\nEnter Output File Name=");
	file2=br.readLine();
	FileInputStream fp1=new FileInputStream(file1);
	FileOutputStream fp2=new FileOutputStream(file2);
	n=0;
		while((ch=fp1.read())!=-1)
		{
		n++;
		fp2.write(n);
		fp2.write(ch);
		}
	fp1.close();
	fp2.close();
	FileInputStream fp3=new FileInputStream(file2);
	n=0;
		while((ch=fp3.read())!=-1)
		{
		n++;
		System.out.print(n+" ");
		ch1=fp3.read();
			if(ch1>=9 && ch1<=13)
			System.out.print(" ");
			else
			System.out.print((char)ch1+" ");
			System.out.println(ch1);
			if((n%20)==0)
			{
			System.out.println("\nPress Enter Key--->");
			br.readLine();
			}
		}

	}	
}