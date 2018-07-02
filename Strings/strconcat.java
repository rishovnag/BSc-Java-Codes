package string;
import java.io.*;
public class Strconcat {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first string");
		String str1=br.readLine();
		System.out.println("Enter second string");
		String str2=br.readLine();
		strcat(str1,str2);
	}
	public static void strcat(String s1, String s2){
		System.out.println(s1);
		System.out.println(s2);
		int l=s2.length();
		s1=s1+' ';
		for(int i=0;i<l;i++){
			s1=s1+s2.charAt(i);
		}
		System.out.println(s1);
	}
}
