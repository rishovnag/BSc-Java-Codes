import java.io.*;
class Gauss_Seidal
{
	public void gauss_seidal(float a[][],float b[],float x[],int n)
	{
	float xg[]=new float[10];
	float eps[]=new float[10];
	int i,j,flag;
	float sum;
	int itr;
	//to initialize guess values to '0'
		for(i=0;i<n;i++)
		xg[i]=0;
	//gauss seidal iteration starts
	flag=0;
	itr=0;
		while(flag==0)
		{
		flag=1;
		itr++;
		//to calculate iterative solutions
			for(i=0;i<n;i++)
			{
			sum=0;
				for(j=0;j<n;j++)
					if(i!=j)
					sum=sum+a[i][j]*xg[j];
			x[i]=(b[i]-sum)/a[i][i];
			eps[i]=Math.abs(x[i]-xg[i]);
			xg[i]=x[i];
			}
			for(i=0;i<n;i++)
				if(eps[i]> 1e-06)
				flag=0;
		}
//to display all roots
	for(i=0;i<n;i++)
	System.out.println("x["+i+"]="+x[i]);
	System.out.println("\nNumber of iterations="+itr);
	}
}

class gauss_seidal_main
{
	public static void main(String args[])throws IOException
	{
	float a[][]=new float[10][10];
	float b[]=new float[10];
	float x[]=new float[10];
	int i,j,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter Number of equations=");
	n=Integer.parseInt(br.readLine());
	System.out.println("Enter all co-efficients-->");
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
	Gauss_Seidal GS=new Gauss_Seidal();
	GS.gauss_seidal(a,b,x,n);
	}
}
