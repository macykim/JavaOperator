package condition;

import java.util.Scanner;

/*
 * @ Date: 2015.07.10
 * @ Author: Me
 * @ Story: switch 예제 (성별 판별)
 */

public class ManOrWoman {
	public void ssn() {
		/* Order: 입력받은 주민번호로 남자인지 여자인지 구분
		 * SSN의 체계
		 * 1, 3 남자
		 * 2, 4 여자
		 * 5번 외국인
		 * 그 외에는 에러	
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 (예: 921212-2111111)");
		String ssn = scanner.next();
		
		String msg = "";
		
		// charAt(n)의 역할: 0부터 시작하여 해당 index 숫자에 해당하는 캐릭터 하나만 뽑아옴
		char ch = ssn.charAt(7);				
		
		switch (ch) {
		case '1': case '3': msg = "남자"; break;
		case '2': case '4': msg = "여자"; break;
		case '5': case '6': msg = "외국인"; break;
		default: msg = "잘못된 번호"; break;
		}	
		
		System.out.println("입력하신 SSN은 " + msg + "입니다.");
		
	}
}
