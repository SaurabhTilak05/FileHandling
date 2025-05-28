package FileHandlingCodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CopyImage {

	public static void main(String[] args)throws Exception
	{
		 FileInputStream fl=new FileInputStream("C:\\Users\\saura\\Downloads\\Photo.jpg");
		 FileOutputStream ft=new FileOutputStream("C:\\Users\\saura\\Desktop\\FileHandling\\copy.jpg");
		 int data;
		 while((data=fl.read())!=-1)
		 {
			 ft.write(data);
			 
		 }
	}

}
