package ifCondition;
/*
 * @ Date: 2015.07.09
 * @ Author: Me
 * @ Story: If-Else를 이용한 간단한 프로그램 짜기 
 */

import java.util.Scanner;

public class CalcAvgMain {
	public static void main(String[] args) {
		/*
		 * Order: 학생 국어 영어 수학 총점 평균 합격여부
		 * ---------------------------------------------------------------------
		 * ---------------- 홍길동 90 90 90 270 90 합격 평균이 90점 이상이면 장학생 평균이 70점 이상이고
		 * 90점 미만이면 합격 평균이 70점 미만이면 불합격
		 */

		/*
		 * System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		 * System.out.println(
		 * "--------------------------------------------------------");
		 * 
		 * my answer double kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		 * 
		 * String name = "홍길동";
		 * 
		 * kor = 97.5; eng = 92; math = 95; total = kor + eng + math; avg =
		 * (total / 3);
		 * 
		 * if (avg >= 90) {System.out.println(name + "\t" + kor + "\t" + eng +
		 * "\t" + math + "\t" + total + "\t" + avg+ "\t장학생" );} else if ((avg
		 * >=70) && (avg <90)) {System.out.println(name + "\t" + kor + "\t" +
		 * eng + "\t" + math + "\t" + total + "\t" + avg+ "\t합격" );} else
		 * {System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math +
		 * "\t" + total + "\t" + avg+ "\t불합격" );}
		 */

		// 답

		// 선언부
		String name = "", msg = "";
		// 점수는 연산을 해야 되서 int 타입으로 정해져야 한다.
		int kor = 0, eng = 0, math = 0, sum = 0, avg = 0;
		Scanner scanner = new Scanner(System.in);

		// 연산부
		System.out.println("이름: ");
		name = scanner.next();
		System.out.println("국어: ");
		kor = scanner.nextInt();
		System.out.println("영어: ");
		eng = scanner.nextInt();
		System.out.println("수학: ");
		math = scanner.nextInt();
		sum = kor + eng + math;
		avg = (int) sum / 3; // 다운캐스팅. 소수점 이하 버림

		if (avg >= 90) {
			msg = "장학생";
		} else if ((avg >= 70) && (avg < 90)) {
			msg = "합격";
		} else {
			msg = "불합격";
		}

		// 출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg + "\t" + msg);

	}

}
