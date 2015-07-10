package loop;
/*
 * @ Date: 2015.07.10
 * @ Author: Me
 * @ Story: for-loop을 활용한 1부터 10까지의 합
 */

public class ForLoopSum {
	public static void main(String[] args) {
		// 지변을 초기화 하지 않는 이유는, for-loop 내부에서 자동적으로 하기 때문
		
		/* 
		 * for문 내부에 variable (i = 0)을 바꾸지 않기 위한 -> 기본 식은 바꾸지 않는 것이 좋기 때문에
		 * sum variable을 선언하면 값이 변질되므로 외부에서 선언하고 초기화 할 것 
		 */
		int sum = 0;
		for (int i = 0; i < 11; i++) {
		 sum += i;} // i 값이 회전하면서 증가하는 값을 누적시키는 연산	
		
		
		System.out.println("1부터 10까지의 합: " + sum);
	}
}
