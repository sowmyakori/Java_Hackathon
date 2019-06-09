
public class Student implements Comparable<Student> {
	
	String studentName;
	String regNo;
	int marks;
	
	public Student(String studentName, String regNo, int marks)
	{
		this.studentName=studentName;
		this.regNo=regNo;
		this.marks=marks;
	}

	@Override
	public int compareTo(Student s) {
	
		return s.marks-this.marks;
	}
	
	
}
