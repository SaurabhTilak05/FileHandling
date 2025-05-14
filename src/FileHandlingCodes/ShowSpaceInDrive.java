package FileHandlingCodes;
import java.io.File;
import java.util.*;
public class ShowSpaceInDrive {

	public static void main(String[] args) {
		File f[]=File.listRoots();
		System.out.println("Total Drive in hard disk");
		for(int i=0;i<f.length;i++)
		{
			long totalspace=f[i].getTotalSpace();
			long freespace=f[i].getFreeSpace();
			System.out.println(f[i]+"\t"+(totalspace/1073741824 )+"GB\t"+freespace/1073741824);
		}

	}

}
