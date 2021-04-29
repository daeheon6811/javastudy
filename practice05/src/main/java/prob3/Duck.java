package prob3;

public class Duck extends Bird {
	
	

	
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
	public String toString() {
		return "오리 [name=" + name + "]";
	}

	@Override
	protected void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "는 날지 않습니다");
		
	}

	@Override
	protected void sing() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "는 는 소리내어 웁니다");
	}
	

}
