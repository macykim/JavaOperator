package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 
*/

import java.util.Scanner;

public class CardMain3 {
	public static void main(String[] args) {
		/* Order
		   카드 두장을 비교해서 카드 번호가 더 큰 수가 이기는 프로그램 개발
		   일단, 프로토타입 프로그램으로 개발자가 임의의 숫자를 입력하면
		   출력 결과가 아래와 같아야 함
		   [player1 name: number] vs [player2 name: number]
		   player win!
		 */
		
		String name1, name2; // 지변 초기화
		int num1 = 0, num2 = 0; // 지변 초기화
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름1을 입력하세요.");
		name1 = scanner.next();			
		System.out.println("이름2를 입력하세요.");
		name2 = scanner.next();
		
		CardBean3 hong = new CardBean3(name1);
		CardBean3 kim = new CardBean3(name2);
	
		System.out.println(hong.getName() + ": " + hong.getNum());
		System.out.println(kim.getName() + ": " + kim.getNum());
		}
}
