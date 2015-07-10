package condition;
/*
 * @ Date: 2015.07.09
 * @ Author: Me
 * @ Story: 
 */

import java.util.Scanner;

public class CalcAvg {
	public void calcAvg() {
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
