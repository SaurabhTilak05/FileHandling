/*
 * Program 1: Student Record Management System
Operations:
Add a new student record to a file.
View all student records.
Search student by roll number.
Delete a student record.
Update student record.
Explanation:
Each student record contains rollNo, name, and marks.
Records are stored in a text file line by line.
Deletion and update require reading all records and writing back after modifications.
*/

package FileHandlingCodes;
import java.io.*;
import java.util.*;
public class StudentRecordFile {

	private static final String StudentManagement = "StudentData.txt";
	
	
	public static void addStudent() throws IOException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter RollNumber ");
		String roll=s.nextLine();
		System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println("Enter Marks ");
		String mark=s.nextLine();
		
		FileWriter fw = new FileWriter(StudentManagement, true);
		BufferedWriter bw = new BufferedWriter(fw);
        bw.write(roll + "," + name + "," + mark);
        bw.newLine();
        bw.close();
        System.out.println("Student record added.\n");
	}
	
	
	public static void viewAllStudent() throws IOException
	{
		File f=new File(StudentManagement);
		if(!f.exists())
		{
			System.out.println("No records found.\n");
            return;
		}
		BufferedReader br=new BufferedReader (new FileReader(f));
		  String line;
	        System.out.println("\nStudent Records:");
	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(",");
	            if (parts.length == 3) {
	                System.out.println("Roll No: " + parts[0] + ", Name: " + parts[1] + ", Marks: " + parts[2]);
	            }
	        }
	        br.close();
	        
	}
	
	public static void searchStudent(String f, String roll)throws IOException
	{
		File f1=new File(StudentManagement);
		if(!f1.exists())
		{
			System.out.println("No records found.\n");
            return;
		}
		boolean found=false;
		BufferedReader br=new BufferedReader (new FileReader(f1));
		  String line;
	        System.out.println("\nStudent Records:");
	        while ((line = br.readLine()) != null) {
	            String[] parts = line.split(",");
	            
				if (parts.length >=1 && parts[0].equals(roll)) {
	            	System.out.println("Student Found");
	                System.out.println("Roll No: " + parts[0] + ", Name: " + parts[1] + ", Marks: " + parts[2]);
	                found=true;
	                break;
	            }
	        }
	        br.close();
	        if(!found) {
	        	System.out.println("student roll   "+roll+"  not present");
	        }
	}
	
	public static void deleteStudent(String f, String rol)throws IOException
	{
		File originalFile = new File(StudentManagement);
	    File tempFile = new File("temp.txt");
		boolean delete =false;
		BufferedReader br=new BufferedReader (new FileReader(originalFile));
		BufferedWriter bw=new BufferedWriter(new FileWriter(tempFile));
		String line;
        System.out.println("\nStudent Records:");
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            
			if (parts.length >=1 && parts[0].equals(rol)) {
            	 delete=true;
            	 continue;
            }
			bw.write(line);
			bw.newLine();
        }
        br.close();
        bw.close();
        if(delete)
        {
        	if(originalFile.delete() &&tempFile.renameTo(originalFile)) {
        		System.out.println("Record with roll number " + rol + " deleted successfully.");
            } 
        	else {
                System.out.println("Error occurred while deleting the record.");
        	}	
        }
        else {
        	
        	System.out.println("Roll number " + rol + " not found.");
        }
	}

	public static void updateData()throws IOException
	{
		
	}
	public static void main(String[] args) throws IOException {
		
		Scanner s=new Scanner(System.in);
		
		do {
			 System.out.println("=== Student Record Management System ===");
	            System.out.println("1. Add Student");
	            System.out.println("2. View All Students");
	            System.out.println("3. Search Student by Roll Number");
	            System.out.println("4. Delete Student");
	            System.out.println("5. Update Student");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	            int c=s.nextInt();
	            s.nextLine();
	            switch(c) {
	            	
	            case 1:
	            	addStudent();
	            	break;
	            case 2:
	            	viewAllStudent();
	            	break;
	            case 3:
	            	System.out.println("Enter roll number to search");
	            	String r=s.nextLine();
	            	searchStudent("StudentData.txt",r);
	            	break;
	            case 4:
	            	System.out.println("Enter roll number to delete");
	            	String d=s.nextLine();
	            	deleteStudent("StudentData.txt", d);
	            	break;
	            	
	            }
	            
		}
		while(true);
		
		
		
	}

}
