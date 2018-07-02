package string;
import java.io.*;
public class Count {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		int v=vowels(str);
		int a=alphabets(str);
		int c=a-v;
		int n=numerals(str);
		int s=space(str);
		int sp=str.length()-(a+n+s);
		System.out.println("Alpabets="+a);
		System.out.println("Vowels="+v);
		System.out.println("Consonants="+c);
		System.out.println("Numerals="+n);
		System.out.println("Space="+s);
		System.out.println("Special Characters="+sp);
	}
	public static int vowels(String s) {
		int l=s.length();
		s=s.toUpperCase();
		int v=0;
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
				v++;
		}
		return v;
	}
	public static int alphabets(String s) {
		int l=s.length();
		s=s.toUpperCase();
		int a=0;
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
				a++;
		}
		return a;
	}
	public static int numerals(String s) {
		int l=s.length();
		int n=0;
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch>=48 && ch<=57)
				n++;
		}
		return n;
	}
	public static int space(String s) {
		int l=s.length();
		int l1=0;
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch==' ')
				l1++;
		}
		return l1;
	}

}
