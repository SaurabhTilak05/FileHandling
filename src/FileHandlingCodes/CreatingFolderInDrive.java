package FileHandlingCodes;
import java.io.*;
public class CreatingFolderInDrive {

	public static void main(String[] args) {
		File f=new File("C:\\FileHandle Folder");
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("Folder Create Successfully.............");
		}
		else {
			System.out.println("Problem Occure in their.........");
		}
	}
}
