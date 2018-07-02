package string;
import java.util.*;
import java.io.*;
public class Words {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		StringTokenizer s=new StringTokenizer(str); 
		int n=s.countTokens();
		System.out.println("Number of words= "+n);
		while(s.hasMoreTokens())
			System.out.println(s.nextToken());
	}

}
