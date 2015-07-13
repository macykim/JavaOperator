package array;

import java.util.Scanner;

/*
 * @ Date: 2015.07.13
 * @ Author: Me
 * @ Story: int형 배열에서 입력값 중 최대값 구하기
 */

public class InputMax {
	public static void main(String[] args) {
		// 선언부
		System.out.println("3개의 점수를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		// 배열 선언 및 초기화
		int[] arr = new int[3];
		int max = 0; // 최대값을 담을 임의의 변수
		
		// 연산부
		/*
		 for (int i = 0; i < arr.length; i++) {		 
			arr[i] = scanner.nextInt();
			}
		
		// for-loop으로 입력 받고 비교 로직은 if문 사용
		 for (int i = 0; i < arr.length; i++) {
		 	if (arr[0] > arr[1] && arr[0] > arr[2]) {max = arr[0];}
		 	else if (arr[1] > arr[0] && arr[1] > arr[2]) {max = arr[1];}
		 	else {max = arr[2];}
		 */
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max){max = arr[i];}
		}
			
		System.out.println("가장 큰 수는 " + max + "입니다.");

		
	}
}
