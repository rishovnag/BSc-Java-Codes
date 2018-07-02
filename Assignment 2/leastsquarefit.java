//wap to implement least square fit method to fit a polynomial of degree n through m number of points
import java.io.*;
class Least_Square_Fit
{
	public void least_square_fit(float x[],float y[],int m,int n)
	{
	float a[][]=new float[10][10];	
	float b[]=new float[10];
	float x1[]=new float[10];
	int i,j,k,k1,ij;
	float sum,p;
	//to calculate a[][] matrix
		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
			{
			ij=i+j;
			sum=0;
				for(k=0;k<m;k++)
				{
				p=1;
					for(k1=1;k1<=ij;k1++)
					p=p*x[k];
				sum=sum+p;
				}
			a[i][j]=sum;
			}
	//to calculate b[]
		for(i=0;i<n;i++)
		{
		ij=i;
		sum=0;
			for(k=0;k<m;k++)
			{
			p=y[k];
				for(k1=1;k1<=ij;k1++)
				p=p*x[k];
			sum=sum+p;
			}
		b[i]=sum;
		}
	//to display a[][] and b[]
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			System.out.print(a[i][j]+"\t");
		System.out.println(b[i]);
		}
	//to get solutions
	gauss_elimination(a,b,x1,n);
	}
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
	//Apply back substitution mathod
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
class least_square_fit_main
{
	public static void main(String args[])throws IOException
	{
	float y[]=new float[100];
	float x[]=new float[100];
	int i,j,n,m;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter Number of experimental points=");
	m=Integer.parseInt(br.readLine());
	System.out.print("Enter Degree of polynomial=");
	n=Integer.parseInt(br.readLine());
	n=n+1;
	System.out.println("Enter x-points and y-points-->");
		for(i=0;i<m;i++)
		{
		System.out.print("x["+i+"]=");
		x[i]=Float.parseFloat(br.readLine());
		System.out.print("y["+i+"]=");
		y[i]=Float.parseFloat(br.readLine());
		}
	Least_Square_Fit LSF=new Least_Square_Fit();
	LSF.least_square_fit(x,y,m,n);
	}
}
