import java.io.*;
class Bisection_Method
{
	public int bisection_method(double x1[])
	{
	double a,b,c;
	double f1,f2,f3;
	double i;
	int n;
	a=-10;
	n=0;
		for(i=-9.999;i<=10;i=i+.001)
		{
		b=i;
		f1=bisection_function(a);
		f2=bisection_function(b);
			if(f1*f2<0)
			{
				do
				{
				c=(a+b)/2;
				f3=bisection_function(c);
					if(f1*f3<0)
					{
					b=c;
					f2=f3;
					}
					else if(f2*f3<0)
					{
					a=b;
					b=c;
					f1=f2;
					f2=f3;
					}
					if(Math.abs(f3)<1e-10)
					{
					x1[n++]=c;
					break;
					}
	 			}while(true);
			}
		a=i;
		}
	return n;
	}

	public double bisection_function(double x)
	{
	double y;
	y=x*x-3*x+2;
	return y;
	}
}

class bisection_method_main
{
	public static void main(String args[])throws IOException
	{
	int n,i;
	double x[]=new double[10];
	Bisection_Method BM=new Bisection_Method();
	n=BM.bisection_method(x);
	System.out.println("\nSolutions are--->");
		for(i=0;i<n;i++)
		System.out.println("x["+i+"]="+x[i]);
	}
}