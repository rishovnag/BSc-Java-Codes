	import java.io.*;
	class copy
	{
		public static void main(String args[])throws IOException
		{
		int i,n;
		int fs[]=new int[50];
		int ch,nargs;
		nargs=args.length; //To calculate number of arguments
		FileOutputStream fp2=new FileOutputStream(args[nargs-1]);
		n=0;
			for(i=0;i<(nargs-1);i++)
			{
			FileInputStream fp1=new FileInputStream(args[i]);
			fs[i]=0;
				while((ch=fp1.read())!=-1)
				{
				fp2.write(ch);
				fs[i]=fs[i]+1;
				}
		n=n+fs[i];
		fp1.close();
		}
	fp2.close();
	System.out.println("Size of "+args[nargs-1]+"="+n+"Bytes");
	for(i=0;i<(nargs-1);i++)
		System.out.println("Size of"+args[i]+"="+fs[i]+"Bytes");
	}
}

	