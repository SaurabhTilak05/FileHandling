package FileHandlingCodes;
import java.io.*;

public class CreateFileInFolder {

	public static void main(String[] args)throws Exception
	{
		File f=new File("C:\\FileHandle Folder\\second.txt");
		boolean b=f.createNewFile();
		if(b)
		{
			System.out.println("File is Created");
		}
		else {
			System.out.println("File Is Not Created");
		}
	}

}
