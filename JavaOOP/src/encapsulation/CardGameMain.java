package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 
*/

import java.util.Scanner;

public class CardGameMain {
	public static void main(String[] args) {
		/* Order
		   카드 두장을 비교해서 카드 번호가 더 큰 수가 이기는 프로그램 개발
		 */
		
		// 선언부 -> 집에 있는 유저가 자기 모니터에 입력
		// -> 필요 없어져서 지워버림		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름1을 입력하세요.");				
		CardBean3 hong = new CardBean3(scanner.next());
		System.out.println("이름2를 입력하세요.");
		CardBean3 kim = new CardBean3(scanner.next());		
		
		// 인터넷 망을 타고 데이터 값이 게임회사로 들어옴				
		CardGame game = new CardGame(hong, kim);
		
		// 사용자가 결과 화면을 보는 중...
		System.out.println(game.toString()); 
		
	}
}
