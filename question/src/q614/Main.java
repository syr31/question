package q614;

import java.awt.print.Printable;
import java.util.Scanner;

class Student{
	private String SchoolName;
	private int Grade;

	public void SetSchoolName(String SchoolName) { //질문
		this.SchoolName = SchoolName;
	}
	public void SetGrade(int Grade) {	//질문
		this.Grade = Grade;
	}
	public void print() {
		System.out.print(Grade + "grade in" + SchoolName + "School");
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String SchoolName = sc.next();
		int Grade = sc.nextInt();
		Student stu1 = new Student();
		stu1.SetSchoolName(SchoolName);
		stu1.SetGrade(Grade);
		
		Student stu2 = new Student();
		stu2.SetSchoolName("Jejuelementary");	// 질문
		stu2.SetGrade(6);
		
		stu1.print();
		stu2.print();
		
		
	}

}
