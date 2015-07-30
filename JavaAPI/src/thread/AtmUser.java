package thread;
/*
 * @ Date: 2015.07.30
 * @ Author: 김청명
 * @ Story: 
 */

public class AtmUser implements Runnable {
	// 필드에 사용자 타입의 클래스 (= 개발자가 만든 클래스)가 있고, 아래
	// 멤버메소드 영역에 있는 메소드가 파라미터로 이 클래스 타입의 변수를 받을 
	// 경우, 이를 의존관계라 하며 "AtmUser가 Atm을 사용한다" 라고 표현한다.
	
	// 객체지향에서는 클래스들끼리 관계를 맺어서 사용방법을 정의한다.
	// 관계에는 크게 상속, 구현, 의존, 연관 관계 등이 있는데,
	// 그 중 상속을 IsA, 의존을 use 관계라고 한다.
	
	Atm atm;
	String name;
	public AtmUser(Atm atm, String name) {
		
	}
	
	@Override
	public void run() {
		// 스레드에서 동기화를 사용할 경우 getter/setter를 사용하지 않고 무조건 run()을 사용해야 한다.
		atm.inchul(name);
	}
	
}
