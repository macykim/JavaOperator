package Inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: android tester
 */

import java.util.Scanner;

public class AndroidPhoneMain {
	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("통화 상대: ");
		String name = scanner.next();
		System.out.println("메세지: ");
		String msg = scanner.next();
		androidPhone.setOs("");
			// 사용자가 아무 액션을 취하지 않고 스캐너를 입력만 하면 OS는 안드로이드가 세팅되게 만듬
		androidPhone.setData(name, msg);
		System.out.println(androidPhone.getData());
	}
}
