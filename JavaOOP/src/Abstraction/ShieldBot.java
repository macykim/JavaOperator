package Abstraction;

public class ShieldBot extends BasicBot{
	private int protectPoint;
	
	@Override
	public void status() {
		super.status();
		System.out.println("로봇 방어력: " + this.protectPoint);
	}

	public int getProtectPoint() {
		return protectPoint;
	}

	public void setProtectPoint(int protectPoint) {
		this.protectPoint = protectPoint;
	}
	
	
	
}
