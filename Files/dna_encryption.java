//to binary and then 
import java.io.*;
class Binary_conversion
{
	public void binary_conversion(int ch,int bit[])
	{
	int n,mask;
	int k;
	mask=128;
	n=0;
		while(mask>0)
		{
		k=ch & mask;
			if(k!=0)
			bit[n++]=1;
			else
			bit[n++]=0;
		mask=mask>>1;
		}
	}
}
class dna_encryption
{
	public static void main(String args[])throws IOException
	{
	String file1,file2;
	int ch,ch1,ch2;
	int bit[]=new int[8];
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter Plain Text file name=");
	file1=br.readLine();
	System.out.print("Enter output file name=");
	file2=br.readLine();
	FileInputStream fp1=new FileInputStream(file1);
	FileOutputStream fp2=new FileOutputStream(file2);
	Binary_conversion BC=new Binary_conversion();
		while((ch=fp1.read())!=-1)
		{
		BC.binary_conversion(ch,bit);
			for(i=0;i<8;i=i+2)
			{
			ch1=bit[i];
			ch2=bit[i+1];
				if(ch1==0 && ch2==0)
				fp2.write(65);
				else if(ch1==0 && ch2==1)
				fp2.write(84);
				else if(ch1==1 && ch2==0)
				fp2.write(67);
				else if(ch1==1 && ch2==1)
				fp2.write(71);
			}
		}
	fp1.close();
	fp2.close();
	}
}