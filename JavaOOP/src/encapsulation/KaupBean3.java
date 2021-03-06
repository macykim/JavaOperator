package encapsulation;

import java.util.Scanner;

/*
 * @ Date: 2015.07.14
 * @ Author: Me
 * @ Story: 카우푸지수 프로그램을 객체화 하는 예제
 */

public class KaupBean3 {
	/* 
	   멤버필드는 은닉화된 데이터 값이 모여 있는 공간이다.
	   가장 큰 특징은 초기화를 하지 않는다.
	   이유는 멤버 메소드들이 이 데이터 공간(필드)를 공유하기 때문이다.	   
	 */
	
	private String name, stat;
	private double height, weight;
	private int idx;
	
	public void getIndex() { // 메소드 (동사)
		
		idx = (int) ((weight / (height * height)) * 10000);
		
		if (idx > 30) {stat = "비만";}
			else if (idx > 24) {stat = "과체중";}
			else if (idx > 20) {stat = "정상";}
			else if (idx > 15) {stat = "저체중";}
			else if (idx > 13) {stat = "마름";}
			else {stat = "영양실조";}				
			}
	
	@Override
	public String toString() {
		/*
		 * public: 접근제한자
		 * String: 리턴 타입(결과값의 타입이 String이다)
		 * toString(): 메소드 이름(이것은 자바에서 픽스된 메소드)
		 */ 
		// 선언부
		String str = "[" + name + "]" + " 키: " 
				+ height + "cm, " + "몸무게: " + weight + "kg, " + "카우프지수: " + idx + ", " + stat; // 지역변수는 무조건 초기화
		// 연산부
		// 출력부
		return str;
	}
}
