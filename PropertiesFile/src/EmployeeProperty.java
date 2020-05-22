import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class EmployeeProperty 
{
	public static void main(String[] args) 
	{
		FileWriter fw =null;
		Properties pro =new Properties();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter Employee Name and Age");
		String emp_name=scan.next();
		int emp_age = scan.nextInt();
		String s = String.valueOf(emp_age); 
		try
		{
			fw=new FileWriter("S:\\FolderOperation\\Employee.properties");
		
			pro.setProperty("Emp_Name", emp_name);
			pro.setProperty("Emp_Age", s);
			
			pro.store(fw,"Employee Details");
			
			System.out.println("Properties File Created Successfully...!");
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(fw!=null)
			{
				try
				{
					fw.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
