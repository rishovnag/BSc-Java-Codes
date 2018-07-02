	import java.io.*;
	class Prime
	{	
	        //to test whether 'n' is a prime or not prime
	        public int is_prime(int n)
	         {
                          int n1,i,k;
	           k=1; //k=return value of method
	           n1=n/2;
	                         for(i=2;i<=n1;i++)
			if((n%i)==0)
			{
			k=0;
			break;
			}
	           return k;
                          }
	}
	class fibonacci
	{
		public static void main(String args[])throws IOException
		{
		int n,k,n1,n2,n3;
		 BufferedReader br=new BufferedReader(new InputStreamReader( System.in ));
		System.out.print("\nEnter n(2-2000)=");
		n=Integer.parseInt(br.readLine());
		System.out.print("\nPrime Fibonacci numbers <="+n+"---->");
		Prime P=new Prime();
		n1=1;
		n2=1;
  			while((n3=n1+n2)<=n)
			{
			k=P.is_prime(n3);
				if(k!=0)
				System.out.print(n3+"\t");
			n1=n2;
			n2=n3;
			}
		}
	}