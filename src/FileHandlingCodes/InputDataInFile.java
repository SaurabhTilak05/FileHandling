package FileHandlingCodes;
import java.io.*;
import java.util.*;
public class InputDataInFile {

	public static void main(String[] args)throws Exception
	{
		FileOutputStream fl=new FileOutputStream("C:\\FileHandle Folder\\second.txt");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Data in file");
		String data=s.nextLine();
		byte b[]=data.getBytes();
		fl.write(b);
		fl.close();
		System.out.println("Data save successfully...........!!");
	}

}
