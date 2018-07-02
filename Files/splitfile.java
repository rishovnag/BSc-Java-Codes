import java.io.*;

public class SPLIT

{
    
	public static void main(String args[])throws IOException
    
	{

        	int ch,nargs,i,j;
        
		long n1,n2;
        
		long n,k;
        
		nargs=args.length;
        
		RandomAccessFile fp1=new RandomAccessFile(args[0],"r");
        
		n=fp1.length();
        
		n1=n/(nargs-1);
        
		n2=n-n1*(nargs-2);
        
		for(i=1;i<nargs;i++)
        
		{
            
			FileOutputStream fp2=new FileOutputStream(args[i]);
            
			if(i!=(nargs-1))
                
				k=n1;
            
			else
                
				k=n2;
            
			for(j=1;j<=k;j++)
        
		        {
                
				ch=fp1.read();
                
				fp2.write(ch);
            
			}
            
			fp2.close();
        
		}
        
		fp1.close();
        
		System.out.println("Size of "+args[0]+" = "+n+" Bytes");
        
		for(i=1;i<nargs;i++)
        
		{
            
			if(i!=(nargs-1))
                
				k=n1;
            
			else
                
				k=n2;

	                System.out.println("Size of "+args[i]+" = "+k+" Bytes");
 
	       }

    }
}
             