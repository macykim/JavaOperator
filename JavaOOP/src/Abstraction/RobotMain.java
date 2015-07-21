package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: Gun & Shield Robot tester
*/

public class RobotMain {
	public static void main(String[] args) {
		/* Order: 
		   Design GunRobot & ShieldRobot
		   출력:
		   건봇의 속도는 10, 에너지는 10, 공격력은 70	=> 공격력은 인스턴스 변수로, int attackPoint	   
		   쉴드봇의 속도는 20, 에너지는 20, 방어력은 50 => 방어력은 인스턴스 변수로, int protectPoint		   
		 */
		
		GunBot gunBot = new GunBot();
		gunBot.run(15);
		gunBot.charge(10);		
		gunBot.setAttackPoint(70);		
		gunBot.status();
		
		ShieldBot shieldBot = new ShieldBot();
		shieldBot.run(25);
		shieldBot.charge(20);		
		shieldBot.setProtectPoint(50);
		shieldBot.status();
	}
}
