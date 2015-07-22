package abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 
*/

public interface Robot {
	// 로봇이 공격하는 기능 	
	public void charge(int energy);	
	 
	// 로봇이 움직이는 기능 	
	public void run(int speed); 
	
	// 로봇 상태 모니터링 
	public void status();
}
