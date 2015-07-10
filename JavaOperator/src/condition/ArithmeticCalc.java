package condition;
/*
 * @ Date: 2015.07.09
 * @ Author: Me
 * @ Story: 사칙연산 계산 프로그램 
 */

import java.util.Scanner;

public class ArithmeticCalc {
	
/* Order: 사칙연산 계산기
	 * 덧셈, 뺄셈, 곱셈, 나눗셈(몫: , 나머지: )
	 * 사칙연산 기호도 입력받습니다. +, *, -, /
	 * 출력결과
	 * === 심플 계산기 ===
	 * 5 * 5 = 25
	 * 5 + 5 = 10
	 * 5 - 5 = 0
	 * 5 - 6 = -1
	 * 5 ÷ 5 = 1 (0)
	 */
	
	public void calc(){
	
	// 선언부
	Scanner scanner = new Scanner(System.in);
	int i = 0, j = 0, result = 0, remain = 0;
	String opcode = "";
	
	// 연산부
	System.out.println("첫번째 수를 입력하세요.");
	i = scanner.nextInt();
	System.out.println("연산기호: ");
	opcode = scanner.next();
	System.out.println("두번째 수를 입력하세요.");
	j = scanner.nextInt();	
		
	if (opcode.equals("+")) {result = i + j;}
	else if (opcode.equals("-")) {result = i - j;}
	else if (opcode.equals("*")) {result = i * j;}
	else if (opcode.equals("/")) {result = i / j; remain = i % j;}
	else {System.out.println("입력된 값이 올바르지 않습니다.");}		
	
	// 출력부
	System.out.println("=== 심플 계산기 ===");
	System.out.println(i + "\t" + opcode + "\t" + j + "\t" + "=" + "\t" + result+"("+remain+")");
	
	}
}
