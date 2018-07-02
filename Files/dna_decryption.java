import java.io.*;
class Byte_conversion
{
	public int byte_conversion(int bit[])
	{
	int sum,base;
	int n;
	base=128;
	n=0;
	sum=0;
		while(base>=1)
		{
		sum=sum+base*bit[n];
		base=base>>1;
		n=n+1;
		}
	return sum;
	}
}
class dna_decryption
{
	public static void main(String args[])throws IOException
	{
	String file1,file2;
	int ch,ch1,ch2,n2;
	long n,n1;
	long j;
	int bit[]=new int[8];
	int i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter Plain Text file name=");
	file1=br.readLine();
	System.out.print("Enter output file name=");
	file2=br.readLine();
	RandomAccessFile fp1=new RandomAccessFile(file1,"r");
	FileOutputStream fp2=new FileOutputStream(file2);
	Byte_conversion BC=new Byte_conversion();
	n=fp1.length();
	n1=n/4;
		for(j=1;j<=n1;j++)
		{
		n2=0;
			for(i=1;i<=4;i++)
			{
			ch=fp1.read();
				if(ch==65)
				{
				bit[n2++]=0;
				bit[n2++]=0;
				}
				else if(ch==84)
				{
				bit[n2++]=0;
				bit[n2++]=1;
				}
				else if(ch==67)
				{
				bit[n2++]=1;
				bit[n2++]=0;
				}
				else if(ch==71)
				{
				bit[n2++]=1;
				bit[n2++]=1;
				}
			}
		ch1=BC.byte_conversion(bit);
		fp2.write(ch1);
		}
	fp1.close();
	fp2.close();
	}
}