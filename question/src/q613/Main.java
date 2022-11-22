package q613;

import java.util.Scanner;

class Student {
	private String Name;
	private String School;
	private int Grade;

	public Student(String Name, String School, int Grade) {
		this.Name = Name;
		this.School = School;
		this.Grade = Grade;
	}

	public void print() {
		System.out.println(" Name : " + Name);
		System.out.println(" School : " + School);
		System.out.println(" Grade : " + Grade);
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Name = sc.next();
		String School = sc.next();
		int Grade = sc.nextInt();

		Student stu = new Student(Name, School, Grade); // 왜 오류가 뜰까..

		stu.print();
	}
}
