package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 
*/

public class BasicBot implements Robot {
/*===================================필드===================================*/
	private int energy;
	private int speed;
	
/*===================================생성자===================================*/
	
/*===================================메소드===================================*/
	@Override
	public void charge(int energy) {
		this.energy += energy;
	}

	@Override
	public void run(int speed) {
		this.speed += speed;
	}

	@Override
	public void status() {
				System.out.println("로봇 속도: " + this.speed);
				System.out.println("로봇 에너지: " + this.energy);
	}
	
	
}
