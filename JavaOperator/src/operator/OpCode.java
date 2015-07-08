package operator;

import java.util.Scanner;

/*
 * @ Date: 2015.07.07
 * @ Author: Me
 * @ Story: 연산 코드에 관한 문법
 */

public class OpCode {
	public static void main(String[] args) {
		/* 연산자(OpCode)는 다음와 같이 분류된다.
		   1) 단향연산자: ++, --, +, -
		   2) 이항연산자:
		    	- 산술연산자: +, -, *, /(몫), %(나머지) 
		    	- 비교연산자: <>, !=(같지않다), ==(같다)
		    	- 삼항연산자: (...)? TRUE : FALSE
		    	- 대입(또는 할당)연산자: =		    			   
		 */
		
		// Lunar Version: Import 단축키: CTRL + SHIFT + O
		// Mars Version: Import 단축키: CTRL + space
			
		Scanner scanner = new Scanner(System.in);
		System.out.println("초기값을 입력하세요");
		int a = scanner.nextInt(); // 스캐너로 입력한 값을 a에 할당함
		System.out.println("연산할 값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println(a+b);
		
	}
}
