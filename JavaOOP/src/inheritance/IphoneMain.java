package inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: iphone tester
 */

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		/* Order:
		   폰을 가지고 다닐 수 있음 
		   아이폰을 사용해서
		   홍길동에게 전화를 검
		   홍길동에게 데이터를 전달
		   출력
		   Hint:
		   아이폰이 출력되게 하려면 클래스변수(=스태틱변수)는
		   클래스이름.BRAND로 가져오면 됩니다.
		   		- iphone.setCompany(Iphone.BRAND);
		 */
		
	Iphone iphone = new Iphone(); // 인스턴스를 통해 메소드 호출 준비
	Scanner scanner = new Scanner(System.in);		
	
	iphone.setCompany(Iphone.BRAND);
		// 클래스명.필드명(클래스명.변수명); ... get/set없이 사용하는 이유는
		// 은닉화가 필요없는 고정된 값이기 때문에 Iphone.BRAND 식으로 사용해야 함.
	iphone.setPortable(Iphone.PORTABLE);
		// Iphone 클래스에 PORTABLE = true라고 선언되어 있기 때문에
		// 애플은 무조건 이동전화만 만든다는 의미..
	System.out.println("수신자: ");	// 통화 상대 입력
	String name = scanner.next();
	iphone.setCall(name);
	System.out.println("보내는 메세지 입력: ");	
	iphone.setData(name, scanner.next());
		// 기존에 자동생성된 set을 파라미터가 2개인 메소드로 변형
	System.out.println(iphone.getMove());
	System.out.println(iphone.getCompany() + "(을)를 사용해서...");	
	System.out.println(iphone.getCall());
	System.out.println(iphone.getData());		
	}
}
