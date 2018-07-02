	import java.io.*;
	class Merge_Sort
	{
		public void merge_sort(int a[],int id[],int n)
		{
		int ia,ua,ib,ub,ix,size;
		int i,j,pass;
		int aux[]=new int[20];
		int iux[]=new int[20];
		size=1;
		pass=0;
			while(size<n)
			{
			ia=0;
			ix=0;	
			pass=pass+1;
				while((ia+size)<n)
				{
				ib=ia+size;
				ua=ib-1;
					if((ib+size-1)<n)
					ub=ib+size-1;
					else
					ub=n-1;
					for(i=ia,j=ib;i<=ua && j<=ub;ix++)
						if(a[i]<=a[j])
						{
						aux[ix]=a[i];
						iux[ix]=id[i];
						i++;
						}
						else
						{
						aux[ix]=a[j];
						iux[ix]=id[j];
						j++;
						}
					//To copy residual elements
					for( ;i<=ua;i++)
					{
					aux[ix]=a[i];
					iux[ix]=id[i];
					ix++;
					}
					for( ;j<=ub;j++)
					{
					aux[ix]=a[j];
					iux[ix]=id[j];
					ix++;
					}
				ia=ub+1;
				}
			//To copy all residual elements of array a[] to aux[]
				for( ;ix<n;ix++)
				{
				aux[ix]=a[ia];
				iux[ix]=id[ia];
				ia++;
				}
			//To copy back all elements from temporary array to original array
			
				for(i=0;i<n;i++)
				{
				a[i]=aux[i];
				id[i]=iux[i];
				}
			System.out.println("Pass# :"+pass+" Size="+size);
			display(a,id,n);
			size=2*size;
			}
		}
		public void display(int a[],int id[],int n)
		{
		try
		{
		int i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nNumber\tIndex");
			for(i=0;i<n;i++)
 			System.out.println(a[i]+"\t"+id[i]);
		System.out.println("Press<enter key> to continue --->");
		br.readLine();
		}
		catch(Exception e)
		{ }
		}
 	}
	class merge
	{
		public static void main(String args[])throws IOException
		{
		int a[]=new int[20];
		int id[]=new int[20];
		int n,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nEnter size of your list(1-20)=");
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter" +n+" elements one by one--->");
			for(i=0;i<n;i++)
			{
			System.out.print("a["+i+"]=");
			a[i]=Integer.parseInt(br.readLine());
			id[i]=i+1;
			}
		System.out.println("Element in Original List");
		Merge_Sort MS= new Merge_Sort();
		MS.display(a,id,n);
		MS.merge_sort(a,id,n);
		System.out.println("Sorted List using Merge Sort method");
		MS.display(a,id,n);
		}
	}