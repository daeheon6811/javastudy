package chapter03;

public class Student extends Person{

	
	private String name;
	private int grade;
	private String cs;

	
	public Student() {
		// 자식의 모든 생성자에서 
		// 부모의 특정 생성자를 명시(explicity) 하지 않으면
		// 암시적으로 부모의 기본생성자가 자동으로 호출된다.
		// 자식 생성자 코드 앞에 호출된다.
		// super();
		
		

		System.out.println("Student 생성자 호출");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getCs() {
		return cs;
	}


	public void setCs(String cs) {
		this.cs = cs;
	}
	
	

}
