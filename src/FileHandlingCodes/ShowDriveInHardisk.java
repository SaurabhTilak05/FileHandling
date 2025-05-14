package FileHandlingCodes;
import java.io.*;
public class ShowDriveInHardisk {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		System.out.println("Total drive in system");
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
	}

}
