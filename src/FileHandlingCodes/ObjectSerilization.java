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
public class ObjectSerilization {

	public static void main(String[] args) throws Exception
	{
		FileOutputStream fil=new FileOutputStream("C:\\FileHandle Folder\\serilization.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fil);
		
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("RAM");
		emp.setSal(2000);
		
		oos.writeObject(emp);
		oos.close();
		System.out.println("Sava Data");
	}

}
