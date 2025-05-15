package FileHandlingCodes;
import java.io.*;
public class CheckFolderPresentorNot {

	public static void main(String[] args) {
		File f=new File("C:\\FileHandle Folder");
		boolean b=f.exists();
		if(b)
		{
			System.out.println("Folder is Alrady Present");
		}
		else {
			String msg=f.mkdir()?"Folder created....... ": "Folder is Not Created";
		}
	}

}
