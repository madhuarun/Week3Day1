package Week3Day1;

public class StudentsInfo {
	
	public void getStudentInfo(int id) 
	{
			
			System.out.println("Student id is::" +id);
		}
	public void getStudentInfo(int id,String stuname) 
	{
			
			System.out.println("Student id is::" +id+ "Student name is::" +stuname);
		}
	public void getStudentInfo(String email,String phnum) 
	{
			
			System.out.println("Student email is::" +email+ "Student phone number is::"  +phnum);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentsInfo studentinfo=new StudentsInfo();
		studentinfo.getStudentInfo(18888);
		studentinfo.getStudentInfo(18888,"Madhu Arun");
		studentinfo.getStudentInfo("madhu@hotmail.com","9876543456");
		
		
	}

}
