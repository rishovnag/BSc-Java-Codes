import java.io.*;

public class REVERSE

{

	public static void main(String args[])throws IOException
    
	{
        
		int ch,i;
        
		long n;
        
		String str="";
        
		RandomAccessFile fp1=new RandomAccessFile(args[0],"r");
        
		FileOutputStream fp2=new FileOutputStream(args[1]);
        
		n=fp1.length();
        
		for(i=0;i<n;i++)
        
		{
            
			while((ch=fp1.read())!=-1)
                
				str=(char)ch+str;
        
		}
        
		for(i=0;i<n;i++)
        
		{
          
			  ch=str.charAt(i);
            
			  fp2.write(ch);
       
		}
        
		fp1.close();
        
		fp2.close();
        
		System.out.println("The file "+args[0]+" was reversed and written into "+args[1]);
    
}
}
