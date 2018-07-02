package string;
import java.io.*;
public class Strcopy {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str1=br.readLine();
		String str2="";
		stcpy(str1,str2);
	}
	public static void stcpy(String s1, String s2) {
		int l=s1.length();
		for(int i=0;i<l;i++){
			s2=s2+s1.charAt(i);
		}
		System.out.println("Original String= "+s1);
		System.out.println("Copied String= "+s2);
	}

}
