	import java.io.*;
	class Insertion_Sort
	{
		public void insertion_sort(int a[],int id[],int n)
		{
		int t1,t2;
		int i,j,pass;
		pass=0;
			for(i=1;i<n;i++)
			{
			t1=a[i];
			t2=id[i];
			j=i-1;
				while(j>=0 && t1 < a[j])
				{
				a[j+1]=a[j];
				id[j+1]=id[j];
				j=j-1;
				System.out.println("Pass# : "+pass);
				display(a,id,n);
				}
			a[j+1]=t1;
			id[j+1]=t2;
			System.out.println("Pass# : "+pass);
			display(a,id,n);
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
	class insertion
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
		Insertion_Sort IS= new Insertion_Sort();
		IS.display(a,id,n);
		IS.insertion_sort(a,id,n);
		System.out.println("Sorted List using Insertion Sort method");
		IS.display(a,id,n);
		}
	}