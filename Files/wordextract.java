import java.io.*;
class words
{
  	public static void main(String args[])throws IOException
	{
	String file1,file2;
	int ch,nw,flag; //ch=character to be extracted,nw=number of words
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter Input File Name=");
	file1=br.readLine();
	System.out.print("Enter Output File Name=");
	file2=br.readLine();//hello
	FileInputStream fp1=new FileInputStream(file1);
	FileOutputStream fp2=new FileOutputStream(file2);
	nw=0;/*how are you
	i am fine*/
	flag=1;
		while((ch=fp1.read())!=-1)
		{
		if((ch>=65 && ch<=90) || (ch>=97 && ch<122))
			{
			System.out.print((char)ch);
			fp2.write(ch);
				if(flag==1)
				{
				nw++;
				flag=0;
					if((nw%20)==0)
					{
		System.out.print("\nPress enter key-->");
					br.readLine();
					System.out.println();
					}
				
				}
			}
			else if(flag==0)
			{
			System.out.println();
			fp2.write(13);
			fp2.write(10);
			flag=1;
			}

		}	
	fp1.close();
	fp2.close();
 	System.out.print("\nTotal number of words"+nw);
	}
}

	