	import java.io.*;
	class Bubble_Sort
	{
		public void bubble_sort(int a[],int id[],int n)
		{
		int temp;
		int i,m,pass,flag;
		pass=0;
		flag=0;
		m=n;
			while(flag==0)
			{
			flag=1;
			pass=pass+1;
			m=m-1;

				for(i=0;i<m;i++)
				{
					if(a[i]>a[i+1])
					{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					temp=id[i];
					id[i]=id[i+1];
					id[i+1]=temp;
					flag=0;
					}
				System.out.println("Pass# : "+pass+" Step# :"+(i+1));
				display(a,id,n);
				}
			
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
	class bubble
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
		Bubble_Sort BS= new Bubble_Sort();
		BS.display(a,id,n);
		BS.bubble_sort(a,id,n);
		System.out.println("Sorted List using Bubble Sort method");
		BS.display(a,id,n);
		}
	}