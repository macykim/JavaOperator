package inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: 전화기 tester
 *          Order:
		    "홍길동에게 전화를 검" 출력
 */

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Phone phone = new Phone();
		// 클래스이름 인스턴스(객체) = new 생성자();
		// 인스턴스를 생성하는 이유? 메소드 호출
		
		phone.setCompany("삼성 가정용 전화기");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("전화 걸 사람: ");
		phone.setCall(scanner.next());
		
		System.out.println(phone.getCompany() + "를 사용해서...");
		
		System.out.println(phone.getCall());
	}
}
