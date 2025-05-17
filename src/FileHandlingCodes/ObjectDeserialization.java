package FileHandlingCodes;
import java.io.*;
class Employee implements Serializable
{
	
	private int id;
	private String name;
	private long sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	}
public class ObjectDeserialization {

	public static void main(String[] args) throws Exception
	{
		
		FileInputStream fil=new FileInputStream("C:\\FileHandle Folder\\serilization.txt");
		ObjectInputStream oois=new ObjectInputStream(fil);
		Object obj=oois.readObject();
		if(obj!=null)
		{
			Employee emp=(Employee)obj;
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSal());
		}
		else {
			System.out.println("NO DATA");
		}
		
	}

}
