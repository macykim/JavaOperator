package Inheritance;

import java.util.Scanner;

/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: 
 */

public class CellphoneMain {
	public static void main(String[] args) {
		Cellphone nokia = new Cellphone();
		// 클래스이름 인스턴스(객체) = new 생성자();
		
		/* Order:
		 * 노키아 가정용 전화기를 사용해서 홍길동에게 전화를 검" 출력
		 */
		
		nokia.setCompany("노키아 가정용 전화기");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수신자: ");
		nokia.setCall(scanner.next());
		
		System.out.println(nokia.getCompany() + "를 사용해서...");
		
		System.out.println(nokia.getCall());
		
		
		
	}
}
