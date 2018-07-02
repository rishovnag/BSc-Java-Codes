import java.io.*;
class shift
{
	public static void display(int a[][],int n)
	{
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+"\t");
			System.out.println();
		}
	}
	public static void leftshift(int a[][],int n) 
	{
		int i,j,t;	
		for(i=0;i<n;i++)
		{
		t=a[i][0];
			for(j=0;j<(n-1);j++)
			a[i][j]=a[i][j+1]; //Copying the corresponding element to next left adjacent cell
		a[i][n-1]=t;
		}
	}
	public static void upshift(int a[][],int n) 
	{
		int i,j,t;	
		for(j=0;j<n;j++)
		{
		t=a[0][j];
			for(i=0;i<(n-1);i++)
			a[i][j]=a[i+1][j]; //Copying the corresponding element to next left adjacent cell
		a[n-1][j]=t;
		}
	}
	public static void rightshift(int a[][],int n) 
	{
		int i,j,t;	
		for(i=0;i<n;i++)
		{
		t=a[i][n-1];
			for(j=n-1;j>0;j--)
			a[i][j]=a[i][j-1]; //Copying the corresponding element to next right adjacent cell
		a[i][0]=t;
		}
	}
	public static void diagonal_shift(int a[][],int n)
	{
		int temp,i;
		for(i=0;i<n/2;i++)
		{
			temp=a[i][i];
			a[i][i]=a[n-1-i][n-1-i];
			a[n-1-i][n-1-i]=temp;
		}
	}
	public static void reverse_diagonal_shift(int a[][],int n)
	{
		int temp,i,j;
		for(i=n-1,j=0;j<n/2;i--,j++)
		{
			temp=a[i][j];
			a[i][j]=a[j][i];
			a[j][i]=temp;
		}
	}
	public static void cycling(int a[][],int n)
	{
	int i,j,temp,d;
		 d=15;
  	for(i=0; i<8; i++)
   	{
       	for(j=15; j>0; j--)
      	{
         		temp=a[i][j];
         		a[i][j]=a[i][j-1];
         		a[i][j-1]=temp;
      	}
   	for(j=0; j<15; j++)
   	   {
     	    temp=a[j][i];
     	    a[j][i]=a[j+1][i];
   	      a[j+1][i]=temp;
     	 }
	  for(j=0; j<15; j++)
 	     {
   	      temp=a[d][j];
    	     a[d][j]=a[d][j+1];
     	    a[d][j+1]=temp;
    	 }
   	 for(j=15; j>0; j--)
    	  {
    	     temp=a[j][d];
      	   a[j][d]=a[j-1][d];
	         a[j-1][i]=temp;
 	     }   
	    d-=1;
	  } 
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[][]=new int[16][16];
		int i,j,m=0;
		for(i=0;i<16;i++)
			for(j=0;j<16;j++)
				a[i][j]=(char)m++;
		System.out.println("\nOriginal matrix\n");
		display(a,16);
		System.out.println();
		leftshift(a,16);
		display(a,16);
		System.out.println();
		upshift(a,16);
		display(a,16);
		System.out.println();
		rightshift(a,16);
		display(a,16);
		System.out.println();
		diagonal_shift(a,16);
		display(a,16);
		System.out.println();
		reverse_diagonal_shift(a,16);
		display(a,16);
		System.out.println();
		cycling(a,16);
		System.out.println();
		display(a,16);
		System.out.println("\n\nModified matrix\n");
		display(a,16);
 	}
}
