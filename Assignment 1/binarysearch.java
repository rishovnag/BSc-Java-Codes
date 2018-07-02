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
			System.out.println("Pass#: "+pass);
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
		System.out.println("Number\tIndex");
			for(i=0;i<n;i++)
			System.out.println(a[i]+"\t"+id[i]);
		System.out.println("Press <Enter> to continue----->");
		br.readLine();
		}
		catch(Exception e)
		{}
	}
}
class Binary_Search extends Bubble_Sort
{
	public void binary_search(int a[],int id[],int n)
	{
	try
	{
	int i,flag;
	int low,high,mid;
	int num,ch;
	bubble_sort(a,id,n);//To sort data
	System.out.println("Elements in your list:");
	display(a,id,n);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		do
		{
		System.out.println("Enter number to be searched");
		num=Integer.parseInt(br.readLine());
		low=0;
		high=n-1;
		flag=0;
			while(low<=high)
			{	
			mid=(low+high)/2;
				if(num<a[mid])
				high=mid-1;
				else if(num>a[mid])
				low=mid+1;	
				else
				{	
				flag=1;
				System.out.println(num+" found at position= "+id[mid]);
				break;
				}
			}
			if(flag==0)
			System.out.println(num+" not found");
		System.out.println("Type 1 to search another number");
		ch=Integer.parseInt(br.readLine());
		}while(ch==1);
		}
		catch(Exception e)
		{}
	}
} 
class binary
{
	public static void main(String args[])throws IOException
	{
	int a[]=new int[20];
	int id[]=new int[20];
	int n,i;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter size of your list(1-20)");
	n=Integer.parseInt(br.readLine());
	System.out.println("Enter "+n+" elements one by one--->");
		for(i=0;i<n;i++)
		{
		System.out.println("a["+i+"]= ");
		a[i]=Integer.parseInt(br.readLine());
		id[i]=i+1;
		}
	System.out.println("Elements in Original List");
	Binary_Search BS=new Binary_Search();
	BS.binary_search(a,id,n);
	}
}