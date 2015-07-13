package array;

import java.util.Scanner;

/*
 * @ Date: 2015.07.13
 * @ Author: Me
 * @ Story: int형 배열 입력 예제
 */

public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0, avg = 0;
		System.out.println("3개의 점수를 입력하세요.");
		int[] arr = new int[3]; // 3개 숫자 저장 공간
		
		// 배열에 값을 입력하라고 하면 무조건 for CTRL + space
		for (int i = 0; i < arr.length; i++) {
			// i = 0 이면 i < arr.length, i = 1 이면 i <= arr.length
			arr[i] = scanner.nextInt();
			}
		
		/*
		// 입력된 값을 출력해 보세요.
		for (int i = 0; i < arr.length; i++) {		
			System.out.print(arr[i]+"\t");
			}
		*/	
		
		// 입력된 값을 합산해 보세요.
		// 누적 공식sum += arr[i];		
		for (int i = 0; i < arr.length; i++) {			
			sum += arr[i];
			}
		System.out.println("합: " + sum);
		
		//입력된 값의 평균을 내보세요.
		for (int i = 0; i < arr.length; i++) {
			//avg = sum / arr.length;
		}
		System.out.println("평균: " + sum/arr.length);
	}
	
}

