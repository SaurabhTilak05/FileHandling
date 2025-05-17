package FileHandlingCodes;
import java.io.*;
public class FileReading {

	public static void main(String[] args) throws Exception {
		FileInputStream fl=new FileInputStream("C:\\FileHandle Folder\\read.txt");//"C:\FileHandle Folder\read.txt"
		int data;
		while((data=fl.read())!=-1)
		{
			char ch=(char)data;
			System.out.print(ch);
		}
	}

}
