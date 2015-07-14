package encapsulation;
/*
 * @ Date: 2015.07.14
 * @ Author: Me
 * @ Story: 카우푸지수 프로그램 러너
 */

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		// 선언부
		String name = "", stat = "";
		double height = 0.0d, weight = 0.0d;
		int idx = 0; // 카우프 지수

		Scanner scanner = new Scanner(System.in);

		// 연산부
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("체중을 입력하세요.");
		weight = scanner.nextDouble();
		System.out.println("신장을 입력하세요.");
		height = scanner.nextDouble();
		
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name);
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		kaupBean.getIndex();
		
		System.out.println(kaupBean.toString());
	}
}
