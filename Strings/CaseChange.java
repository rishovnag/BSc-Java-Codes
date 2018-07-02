package string;
import java.io.*;
public class CaseChange {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		System.out.println("Original String "+str);
		changecase(str);
	}
	public static void changecase(String s)	{
		int l=s.length();
		String str="";
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
				ch=(char) (ch+32);
			else if(ch>=97 && ch<=122)
				ch=(char) (ch-32);
			str=str+ch;;
		}
		System.out.println(str);
	}
}
