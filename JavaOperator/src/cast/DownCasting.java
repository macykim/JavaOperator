package cast;
/*
 * @ Date: 2015.07.07
 * @ Author: Me
 * @ Story: 다운캐스팅 문법
 */

public class DownCasting {
	public static void main(String[] args) {
		/*
		 Downcasting:	
		 	- 강제형 변환	 	
		 	- 데이터 타입이 선언된 두 변수가 있을 때 
		 	  크기가 큰 데이터 타입의 변수값을 크기가 작은 데이터 타입의 변수값에
		 	  할당 할 때 명시적(int)으로 타입을 지정하는 것.
		 	  다만, 데이터의 손실이 발생함
		 	  개발자는 직접 다운캐스팅을 하지 않고, 이클립스를 통해 자동으로 add cast 한다.
		 */
		
		int a = 8; // 정수
		double b = 3.14d; // 실수
		a = (int) b; 
		// 32bit 데이터 타입에 64bit 데이터 타입을 담는 경우.. = 다운캐스팅
		System.out.println("다운캐스팅 결과: " + a);
	}
}