package pdhstudy.networkgame;

public class Fighter implements AttackImpl {

	private int hp;
	private int mp;
	private int damage;
	private int guard;

	AttackImpl attackImpl;

	public Fighter(AttackImpl attackImpl) {
		this.attackImpl = attackImpl;
	}

	@Override
	public void attack() {
		System.out.println("전사 공격 시작");
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getGuard() {
		return guard;
	}

	public void setGuard(int guard) {
		this.guard = guard;
	}

	public AttackImpl getAttackImpl() {
		return attackImpl;
	}

	public void setAttackImpl(AttackImpl attackImpl) {
		this.attackImpl = attackImpl;
	}

}
