package Week3Day1;

public class Student extends Department{
	
public void StudentName() 
{
		
		System.out.println("Student Name is Madhu");
	}
public void StudentDept() 
{
	
	System.out.println("Student department is computer science");
}
public void StudentId() 
{
	
	System.out.println("student id is 5555");
}

	public static void main(String[] args)
	{
		
		// TODO Auto-generated method stub
		Student student=new Student();
		student.CollegeName();
		student.CollegeCode();
		student.CollegeRank();
		student.DepName();
		student.StudentId();
		student.StudentName();
		student.StudentDept();
	

	}

}
