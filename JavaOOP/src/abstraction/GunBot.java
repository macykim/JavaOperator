package abstraction;

public class GunBot extends BasicBot {
	private int attackPoint;
		
	@Override
	public void status() {		
		super.status();
		System.out.println("로봇 공격력: " + this.attackPoint + "\n");
	}

	public int getAttackPoint() {
		return attackPoint;
	}

	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	
}
