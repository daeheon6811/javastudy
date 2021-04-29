package chapter03;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("둘리");
		s1.setGrade(4);
		s1.setCs("cs");
		
		Person p1 = s1; // 업캐스팅(암시적)
		Student s2 = (Student)p1; // 다운캐스팅(명시적)
		
	

	}

}
