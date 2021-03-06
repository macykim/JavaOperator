package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: CardBean Tester 
 */

import java.util.Scanner;

public class CardMain {
	public static void main(String[] args) {
		/* Order
		   카드 두장을 비교해서 카드 번호가 더 큰 수가 이기는 프로그램 개발
		   일단, 프로토타입 프로그램으로 개발자가 임의의 숫자를 입력하면
		   출력 결과가 아래와 같아야 함
		   [player1 name: number] vs [player2 name: number]
		   player win!
		 */
		
		Scanner scanner = new Scanner(System.in);
			
		String name1, name2, winner = ""; // 지변 초기화
		int number1 = 0, number2 = 0; // 지변 초기화
				
		System.out.println("이름1을 입력하세요.");
		name1 = scanner.next();
		System.out.println("숫자1을 입력하세요.");
		number1 = scanner.nextInt();		
		System.out.println("이름2를 입력하세요.");
		name2 = scanner.next();
		System.out.println("숫자2를 입력하세요.");
		number2 = scanner.nextInt();
			
		// 객체를 생성합니다.
		CardBean bean = new CardBean();
				
		// 스캐너가 받아 놓은 값은 현재 지변에 있다.
		// 그런데 연산 로직은 객체에 있다. 
		// 따라서, 지변에 있는 값을 멤변에 던져야 한다.
		
		bean.setName1(name1);
		bean.setName2(name2);
		bean.setNumber1(number1);
		bean.setNumber2(number2);		
		
		System.out.println(bean.toString());
		}
}
