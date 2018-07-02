import java.io.*;
import java.util.Scanner;

class CommentRemove {
	
	void cmntRvm(File fp) throws IOException{
		RandomAccessFile rad=new RandomAccessFile(fp, "rwd");
		//char ch;
		System.out.println(rad.length());
		while(rad.getFilePointer()<rad.length()){
			if((char)rad.read()=='/'){
				char x=(char)rad.read();
				if(x=='/')
					single(rad);
				else{ if(x=='*')
						multi(rad);
				}
			}
		}
	}
		private void multi(RandomAccessFile rad) throws IOException {
		// TODO Auto-generated method stub
			int inipos=(int) (rad.getFilePointer()-2);
			int len=2;
			char x;
			while((x=(char)rad.read())!='\0'){
				len++;
				if(x=='*'){
					len++;
					if((char)rad.read()=='/') break;
					}
			}
			write(rad,inipos, len);
	}
		public void write(RandomAccessFile rad,int inipos, int len) throws IOException {
			// TODO Auto-generated method stub
		rad.seek(inipos);
			for(int i=0;i<len;i++) rad.write(" ".getBytes());
		}
		
		void single(RandomAccessFile rad) throws IOException{
			int inipos=(int) (rad.getFilePointer()-2);
			int len=2;
			char x;
			while((x=(char)rad.read())!='\0' && x!='\n') 
				len++;
			write(rad,inipos,len);
		}
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter file path : ");
		File fp=new File(sc.nextLine());
		sc.close();
		CommentRemove ob=new CommentRemove();
		ob.cmntRvm(fp);
		System.out.println("Done !!");
	}
}

