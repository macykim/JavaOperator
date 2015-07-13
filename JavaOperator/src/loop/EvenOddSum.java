package loop;
/*
 * @ Date: 2015.07.13
 * @ Author: Me
 * @ Story: for-loop + if 결합 예제
 */

import java.util.Scanner;

public class EvenOddSum {

	public void calc() {
		/*
		 * 입력받은 수 (e.g. 1) 부터 입력받은 수 (e.g. 10) 까지의 
		 * 수 중에서 각각 짝수의 합과 홀수의 합을 분리해서 출력하시오. 
		 */ 
		
		int a = 0, b = 0, evenSum = 0, oddSum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("시작값을 입력하세요.");
		a = scanner.nextInt();
		System.out.println("한계값을 입력하세요.");
		b = scanner.nextInt();
												
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0){evenSum += i;}
			else {oddSum += i;}
		}
			
		System.out.println(a + "부터 " + b + "까지의 정수 중에서 "
				+ "짝수의 합은 " + evenSum + "이고 "
				+ "홀수의 합은 " + oddSum + "이다.");
		
		
	}
}
	