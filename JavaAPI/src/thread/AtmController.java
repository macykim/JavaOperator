package thread;
/*
 * @ Date: 2015.07.30
 * @ Author: 김청명
 * @ Story: 
 */

public class AtmController {
	public static void main(String[] args) {
		
		Atm atm = new Atm();
			// 인터페이스타입 객체 = new 임플리먼트클래스이름();
		Runnable user1 = new AtmUser(atm, "김유신");
		Runnable user2 = new AtmUser(atm, "이순신");
		Runnable user3 = new AtmUser(atm, "강감찬");
		Runnable user4 = new AtmUser(atm, "홍길동");
			// 디자인패턴(23개): 데코레이션패턴
				// -> 케익 + 과일 => 과일케익
				// -> 
		Thread t1 = new Thread(user1);
			t1.start();
				// start()를 호출해야 콜백메소드인 run()을 호출한다.
		Thread t2 = new Thread(user2);
			t2.start();
		Thread t3 = new Thread(user3);
			t3.start();
		Thread t4 = new Thread(user4);
			t4.start();
		
	}
}
