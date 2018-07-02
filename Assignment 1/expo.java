	import java.io.*;
	class Exp
	{
		public double expx(double x)
		{
		double ce,pe,eps,px,fact;
		int n;
		ce=1;
		pe=0;	
		eps=Math.abs(ce-pe);
		n=1;
		fact=1;
		px=1;
			while(eps> 1e-16)
			{
			pe=ce;
			fact=fact*n;
			px=px*x;
			ce=ce+px/fact;
			eps=Math.abs(ce-pe);
			n=n+1;
			}
		return ce;
		}
	}
	class expo
	{
		public static void main(String args[])
		{
		double x,y;
		int i;
		Exp E=new Exp();
			for(i=1;i<=20;i++)
			{
			x=i*.1;
			y=E.expx(x);
			System.out.println("exp("+x+")="+y);
			}
		}
	}	