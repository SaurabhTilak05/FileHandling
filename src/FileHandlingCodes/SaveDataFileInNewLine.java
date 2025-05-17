package FileHandlingCodes;
import java.io.*;
import java.util.*;
public class SaveDataFileInNewLine {

	public static void main(String[] args)throws Exception
	{
		FileWriter fw=new FileWriter("C:\\FileHandle Folder\\second.txt",true);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		System.out.println("Enert Data in File  ");
		String data=s.nextLine();
		bw.write(data);
		bw.newLine();
		bw.close();
		fw.close();
		System.out.println("Save Data SuccessFully.......!!");
	}

}
