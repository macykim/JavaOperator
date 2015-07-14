package encapsulation;

import java.util.Scanner;

/*
 * @ Date: 2015.07.14
 * @ Author: Me
 * @ Story: 카우푸지수 (Kaup's Index: a.k.a 체질량 지수 (BMI: Body Mass Index) 프로그램을 객체화 하는 예제
 */

public class KaupBean2 {
	/* 
	   public은 은닉화가 되어 있지 않은 상태임
	   은닉화를 하려면 private을 넣어야 함
	   그런데, 데이터 값은 private을 넣어야 은닉화되고
	   기능-메소드는 public을 넣어야 함
	 
	   자바의 계층 구조
	   프로젝트 (어플리케이션) > 패키지 > 클래스 > 멤버
	   멤버는 딱 두가지로 구성되어있다.
	   -> private으로 선언된 (감춰진) 속성: 멤버 필드 
	   -> public으로 선언된 (오픈된) 속성: 멤버 메소드 
	 */
	
	private String name, stat;
	private double height, weight;
	private int idx;
	
	public void getIndex() {
		/* Order
		 * 카우프 지수는 키와 몸무게를 입력하면 저체중, 정상, 비만 이런 식의 결과값을 내어주는 프로그램.
		 * 콘솔에 출력되는 문장(결과값)은: 
		 * [홍길동] 키: 180cm, 몸무게: 70kg, 카우프지수: 정상
		 * 카우프 공식: (체중/신장^2)*10000 결과값이
		 * 30초과: 비만, 24초과: 과체중, 20초과: 정상, 
		 * 15초과: 저체중, 13초과: 마름, 10초과: 영양실조
		 */
		
		// 선언부
		String name = "", stat = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; // 카우프 지수
		
		Scanner scanner = new Scanner(System.in);
		
		// 연산부			
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("체중을 입력하세요.");
		weight = scanner.nextDouble();
		System.out.println("신장을 입력하세요.");
		height = scanner.nextDouble();
		
		idx = (int) ((weight / (height * height)) * 10000);
		
		if (idx > 30) {stat = "비만";}
			else if (idx > 24) {stat = "과체중";}
			else if (idx > 20) {stat = "정상";}
			else if (idx > 15) {stat = "저체중";}
			else if (idx > 13) {stat = "마름";}
			else {stat = "영양실조";}
				
		// 출력부
		
		System.out.println("[" + name + "]" + " 키: " 
		+ height + "cm, " + "몸무게: " + weight + "kg, " + "카우프지수: " + idx + ", " + stat);
	}
}
