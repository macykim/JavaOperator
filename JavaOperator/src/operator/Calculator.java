package operator;

import java.util.Scanner;

/*
 * @ Date: 2015.07.08
 * @ Author: Me
 * @ Story: 
 */

public class Calculator {
	public static void main(String[] args) {
		/* 
		 * order: 스캐너로 두 값을 입력받아서 사칙연산 결과가 나오도록 하시오.
		 * 결과물이 이렇게 나오도록
		 * 20 + 7 = 27
		 * 20 * 7 = 140 
		 */
		
		// 연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		
		int i = 20, j = 7, add = 0, mult = 0;
		add = i + j;
		mult = i * j;
		
		// 연산부
		System.out.println("i 값 입력: ");
		i = scanner.nextInt(); // next 커서 다음 글자(숫자)를 변수 할당
		System.out.println("j 값 입력: ");
		j = scanner.nextInt();
		
		// 출력영역
		
		System.out.println(i + " + " + j + " = " + add);
		System.out.println(i + " * " + j + " = " + mult);
		
				
		
	}
}
