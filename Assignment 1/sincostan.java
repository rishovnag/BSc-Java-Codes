	import java.io.*;
	class Sin_Cos_Tan
	{
		public double sine(double x)
		{
		double csin,psin,eps,fact,px,xrad;
		int sf,i,n;
		xrad=x*3.141592653589793/180;
		csin=xrad;
		psin=1;
		eps=Math.abs(csin-psin);
		n=3;
		sf=-1;
				while(eps>1e-16)
				{
					psin=csin;
					fact=1;
					px=1;
						for(i=1;i<=n;i++)
						{
							fact=fact*i;
							px=px*xrad;
						}
					csin=csin+sf*px/fact;
					eps=Math.abs(csin-psin);
					n=n+2;
					sf=-sf;
				}
			return csin;	
				
		}
		public double cosine(double x)
		{
		double ccos,pcos,eps,fact,px,xrad;
		int sf,i,n;
		xrad=x*3.141592653589793/180;
		ccos=1;
		pcos=0;
		eps=Math.abs(ccos-pcos);
		n=2;
		sf=-1;
				while(eps>1e-16)
				{
					pcos=ccos;
					fact=1;
					px=1;
						for(i=1;i<=n;i++)
						{
							fact=fact*i;
							px=px*xrad;
						}
					ccos=ccos+sf*px/fact;
					eps=Math.abs(ccos-pcos);
					n=n+2;
					sf=-sf;
				}
			return ccos;	
				
		}
		public double tangent(double x)
		{
		double y;
		y=sine(x)/cosine(x);
		return y;
		}
	}
	class tan
	{
		public static void main(String args[])throws IOException
		{
			double y1,y2,y3;
			double x;
			int count;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Sin_Cos_Tan SCT=new Sin_Cos_Tan();
			count=0;
					for(x=0;x<=360;x=x+5)
					{
						y1=SCT.sine(x);
						y2=SCT.cosine(x);
						y3=SCT.tangent(x);
						System.out.println("x="+x+"sin(x)="+y1+"cos(x)="+y2+"tan(x)="+y3);
						count=count+1;
							if((count%10)==0)
							{
								System.out.println("\nPress<ENTER> key to continue--->");
								br.readLine();
							}
					}
		}
	}