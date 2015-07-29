package memberEx;
/*
 * @ Date: 2015.07.29
 * @ Author: 김청명
 * @ Story: 
 */

import java.util.Scanner;

public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
			// 커맨트 패턴
		
		Scanner scanner = new Scanner(System.in);
		String input, userid, password, name, address = "";		
		int age = 0;
		
		while (true) {
			System.out.println("[JOIN]: 회원가입, [LOGIN]: 로그인, [LOGOUT]: 로그아웃");
			input = scanner.next();
			if (input.equals("로그아웃")) {
				System.out.println("로그아웃!");
				break;}			
			else if (input.equals("회원가입")) {				
					System.out.println("회원가입을 시작합니다.");
					System.out.println("이름을 입력해 주세요.");
					name = scanner.next();				
					System.out.println("원하시는 ID를 입력해 주세요.");
					userid = scanner.next();
					System.out.println("사용하실 비밀번호를 입력해주 세요.");
					password = scanner.next();
					System.out.println("나이를 입력해 주세요.");
					age = scanner.nextInt();
					System.out.println("주소를 입력해 주세요.");
					address = scanner.next();
					service.join(userid, password, name, age, address);
					System.out.println("회원가입이 완료되었습니다.");
					break;}
			else if (input.equals("로그인")){
				System.out.println("ID를 입력해 주세요.");
				userid = scanner.next();
				System.out.println("비밀번호를 입력해 주세요.");
				password = scanner.next();
				service.login(userid, password);
				System.out.println("로그인 되었습니다.");
				break;
			}
			else {System.out.println("올바른 값을 입력해 주세요.");}				
		}			
	}
	
	/*private static int inputCheck(int input, int i, int j) {
		if (input < i || input > j) {
			System.out.println("선택메뉴에서 범위값 외의 수를 입력했습니다.");
			return 0;}
				// 시스템 종료. 리턴타입의 디폴트 값을 리턴했기 때문.
		else {
			return input;}*/
}



