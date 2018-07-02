package string;
import java.io.*;
public class AllTrim {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String");
		String str=br.readLine();
		String lstr=ltrim(str);
		String rstr=rtrim(lstr);
		String mstr=alltrim(rstr);
		System.out.println("Final String= "+mstr);
	}
	public static String ltrim(String s) {
		int l=s.length();
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				s=s.substring(i, l);
				break;
			}
		}
		return s;
	}
	public static String rtrim(String s) {
		int l=s.length();
		for(int i=l-1;i>=0;i--) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				s=s.substring(0, i+1);
				break;
			}
		}
		return s;
		
	}
	public static String alltrim(String s) {
		int l=s.length();
		String str="";
		for(int i=0;i<l;i++) {
			char ch=s.charAt(i); 
			if(ch==' ')	{
				while(s.charAt(i)==' ') {
						i++;
						if(i>=l)
							break;
				}
			str=str+ch;
			i--;
			}
			else
				str=str+ch;
		}
		return str;
	}
}
