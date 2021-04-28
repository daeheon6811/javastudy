package prob04;

public class Depart extends Employee {

	String department;

	Depart(String name, int salary, String department) {
		setName(name);
		setSalary(salary);
		this.department = department;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	@Override
	public void setSalary(int salary) {
		// TODO Auto-generated method stub
		super.setSalary(salary);
	}

	@Override
	public void getInformation() {
		System.out.println("이름:" + super.getName() + "연봉:" + super.getSalary() + "부서:" + department);
	}

}
