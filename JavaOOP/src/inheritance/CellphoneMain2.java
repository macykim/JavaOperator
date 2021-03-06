package inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: Order:
		 	폰을 가지고 다닐 수 있음 
		    노키아 휴대전화를 사용해서 
		    홍길동에게 전화를 검
		    출력
 */

import java.util.Scanner;

public class CellphoneMain2 {
	public static void main(String[] args) {
		Cellphone nokia = new Cellphone();
		// 클래스이름 인스턴스(객체) = new 생성자();	
				
		nokia.setCompany("노키아 휴대전화");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수신자: ");
		nokia.setCall(scanner.next());
		nokia.setPortable(true); // 휴대폰은 이동성이 존재하므로
		
		// boolean 타입의 set 메소드를 이용하여 setMove를 자동 설정하게끔 유도하고
		// 출력은 isPortable()이 아니라 getMove()를 호출하게 하는 패턴
		System.out.println(nokia.getMove());
		System.out.println(nokia.getCompany() + "를 사용해서...");		
		System.out.println(nokia.getCall());		
	}
}
