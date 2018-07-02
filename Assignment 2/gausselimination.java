import java.io.*;
class Gauss_elimination
{
	public void gauss_elimination(float a[][],float b[],float x[],int n)
	{
 	float sum;
	int i,j,k;
	float am;
	//to form triangular equations
		for(i=0;i<n;i++)
		  for(j=0;j<n;j++)
		    {
			if(i!=j)
			{
			am=a[j][i]/a[i][i];
			       for(k=0;k<n;k++)
			       a[j][k]=a[j][k]-a[i][k]*am;
			     b[j]=b[j]-b[i]*am;
			}
		}
	//apply back substitution method
	x[n-1]=b[n-1]/a[n-1][n-1];
		for(i=(n-2);i>=0;i--)
		{
		sum=0;
		        for(j=(i+1);j<n;j++)
		        sum=sum+a[i][j]*x[j];
		 x[i]=(b[i]-sum)/a[i][i];
		}
	//to display all roots

	for(i=0;i<n;i++)
	System.out.println("x["+i+"]="+x[i]);
	}
	}
	
 	class gauss_elimination_main
	{
		public static void main(String args[])throws IOException
		{
		float a[][]= new float[10][10];
		float b[]=new float[10];
		float x[]=new float[10];
		int i,j,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		      System.out.print("\nEnter Number of equations=");
		      n=Integer.parseInt(br.readLine());
		      System.out.println("Enter all co-efficients--->");
		      	for(i=0;i<n;i++)
		 	{
				 for(j=0;j<n;j++)
				{
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=Float.parseFloat(br.readLine());
				}
			System.out.print("b["+i+"]=");
			b[i]=Float.parseFloat(br.readLine());
			}
			Gauss_elimination GE=new Gauss_elimination();
			GE.gauss_elimination(a,b,x,n);
	}
		
}		