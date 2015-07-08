package cast;
/*
 * @ Date: 2015.07.07
 * @ Author: Me
 * @ Story: 업캐스팅 문법
 */

public class UpCasting {
	public static void main(String[] args) {
		/*
		 Upcasting:
		 	- 변환(Conversion)
		 	- 묵시적 자동변환
		 	- 데이터 타입이 선언된 두 변수가 있을 때 
		 	  크기가 작은 데이터 타입의 변수값을
		 	  크기가 큰 데이터 타입의 변수값에 할당 할 때
		 */
		
		int a = 3; // 정수
		double b = 3.14d; // 실수
		b = a; // 64bit 데이터 타입에 32bit 데이터 타입을 담는 경우.. = 업캐스팅
		System.out.println("업캐스팅 결과: " + b);
	}
}
