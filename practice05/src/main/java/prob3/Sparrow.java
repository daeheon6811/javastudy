package prob3;

public class Sparrow extends Bird {

	
	
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
	protected void fly() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "는 날지 납니다");
	}

	
	
	@Override
	public String toString() {
		return "참새 [name=" + name + "]";
	}

	@Override
	protected void sing() {
		// TODO Auto-generated method stub
		System.out.println(getName() + "는 소리내어 웁니다");
	}
	
	

	
}
