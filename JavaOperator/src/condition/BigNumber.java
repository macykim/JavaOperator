package condition;
/*
 * @ Date: 2015.07.10
 * @ Author: Me
 * @ Story: 숫자 비교하는 프로그램 
 */

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/* Order:
		 * 학생 3명의 이름과 점수를 입력받아서 1등을 출력 (0~100점)
		 * 출력 결과:
		 * 1등은 홍길동이며 A점 입니다.
		 * Hint: a와 b 비교, b와 c를 비교, a와 c를 비교 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int score1 = 0, score2 = 0, score3 = 0, hscore = 0;
		
		System.out.println("숫자 1: ");
		score1 = scanner.nextInt();
		System.out.println("숫자 2: ");
		score2 = scanner.nextInt();
		System.out.println("숫자 3: ");
		score3 = scanner.nextInt();
		
		/* 
		 * 조건식을 따져서 결과를 가정하지 말고, 
		 * 결과를 상정한 다음 그것에 맞는 조건실을 설정하세요.
		 */
		
		if (score1 > score2 && score1 > score3){
			hscore = score1;}
		else if (score2 > score1 && score2 > score3){
			hscore = score2;}
		else if (score3 > score1 && score3 > score2){	
			hscore = score3;}
		else if (score1 == score2 || score1 == score3){
			System.out.println("동점자가 존재합니다."); hscore = score1;
		}
		else if (score2 == score3){
			System.out.println("동점자가 존재합니다."); hscore = score2;
		}
		else {System.out.println("오류입니다.");}
		
		System.out.println("1등은 " + hscore + "점 입니다.");
	}
}
