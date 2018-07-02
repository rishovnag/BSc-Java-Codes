package string;
import java.io.*;
public class Palindrome {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		String strrev=rev(str);
		if(strrev.equals(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
	public static String rev(String s) {
		int l=s.length();
		String str="";
		for(int i=l-1;i>=0;i--) {
			str=str+s.charAt(i);
		}
		return str;
	}
	

}
