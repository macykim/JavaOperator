package escape;
/*
 * @ Date: 2015.07.07
 * @ Author: Me
 * @ Story: 상수에 관한 문법
 */

import java.util.Scanner;

public class EscapeDemo {
	public static void main(String[] args) {
		/* 
		 escape 문자: (\t, \n) 처럼 알파벳에 \를 첨부하여 특수한 기능을 나타내도록 한 문법으로,
		 종류는 다양하나많이 있지만, \t와 \n만 알아도 무방함
		 \t = tab키 효과
		 \n = 줄바꿈
		 */
		
		/* 문제:
		 * 홍길동씨는 30세 이고, 김유신씨는 25세 입니다.
		 * 홍길동씨와 김유신씨의 나이 차이를 출력하는데,
		 * "홍길동씨는 김유신씨보다 5세가 많습니다."를 출력하시오.
		 */
		
		/* 내 답 (1): 
		   int hong = 30;
		   int kim = 25;
		   int dif = hong - kim;
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("홍길동씨는 김유신씨보다 "+ dif +"세가 많습니다.");
		 */
		
		/* 내 답 (2):
		int hong = 0, kim = 0, dif = 0; 	// 지역변수 선언부.. 나이 디폴트
		
		hong = 30;
		kim = 25;
		String h = "홍길동", k = "김유신";
		dif = hong - kim;
	
		Scanner scanner = new Scanner(System.in);
		System.out.println(h + "씨는 " + k + "씨보다 "+ dif +"세가 많습니다.");
		*/
		
		
		//연산부
		int hong = 0, kim = 0, dif = 0; 	// 지역변수 선언부.. 나이 디폴트
		
		hong = 30;
		kim = 25;
		String h = "홍길동", k = "김유신";
		dif = hong - kim;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		h = scanner.next();
		System.out.println("이름을 입력하세요");
		k = scanner.next();
		System.out.println("홍길동씨 나이를 입력하세요");
		hong = scanner.nextInt();
		System.out.println("김유신씨 나이를 입력하세요");
		kim = scanner.nextInt();
		System.out.println();
		
		System.out.println(h + "씨는 " + k + "씨보다 "+ dif +"세가 많습니다.");
				
		}
}
