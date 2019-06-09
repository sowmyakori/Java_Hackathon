import java.util.ArrayList;
import java.util.Collections;

public class StudentRank_Entry {

	public static void main(String[] args) {

		Student student1 = new Student("Shiv", "005", 97);
		Student student2 = new Student("Banu", "001", 88);
		Student student3 = new Student("Eesh", "001", 67);
		Student student4 = new Student("Lori", "004", 99);
		Student student5 = new Student("Chris", "003", 86);
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		Collections.sort(studentList);
		System.out.println("NAME  REGNO  MARKS  RANK");
		System.out.println("________________________");
		for(int i =0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i).studentName+"   "+studentList.get(i).regNo+"   "+studentList.get(i).marks+"    "+(i+1));
		}
	}

}
