package pdhstudy.networkgame;

public abstract class GameSettingImpl {

	private int hp;
	private int mp;
	private int guard;
	private int damgae;
	


	public void init() {

		System.out.println("DB Setting 을 시작합니다");
		this.hp = 0;
		this.mp = 0;
		this.guard = 0;
		this.damgae = 0;
		
	}

}
