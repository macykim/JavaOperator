package memberAnswer;
/*
 * @ Date: 2015.07.29
 * @ Author: 김청명
 * @ Story: 
 */

import java.util.Scanner;

public class MemberController2 {
	public static void main(String[] args) {
		MemberService2 service = new MemberServiceImpl2();
		// 커맨트 패턴
	
	Scanner scanner = new Scanner(System.in);
	String input = "";
	
	while (true) {
		System.out.println("[JOIN]: 회원가입, [LOGIN]: 로그인, [LOGOUT]: 로그아웃");
		input = scanner.next();
		if (input.equals("로그아웃")) {
			System.out.println("로그아웃!");
			break;}	
		else {
		switch (input) {	
			case "join":
					System.out.println("아이디: ");
					String userid = scanner.next();
					System.out.println("비밀번호: ");
					String password = scanner.next();
					System.out.println("이름: ");
					String name = scanner.next();
					System.out.println("주소: ");
					String address = scanner.next();
					System.out.println("나이: ");
					int age = scanner.nextInt();	
					service.join(userid, password, name, age, address);
					System.out.println("회원가입에 성공하셨습니다.");
					break;
				case "login":
					System.out.println("아이디: ");
					String userid2 = scanner.next();
					System.out.println("비밀번호: ");
					String password2 = scanner.next();
					String result = service.login(userid2, password2);
					String flag = result.substring(0,5);
					if (flag.equals("환영합니다.")){
						System.out.println(result);
					} else if (flag.equals("비번이 다")) {
					} else {
					}
					break;
				default: System.out.println("로그아웃");
					break;
		}
	}
	
}
	}
}
