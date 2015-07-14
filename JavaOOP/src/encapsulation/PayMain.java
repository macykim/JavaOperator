package encapsulation;

import java.util.Scanner;

/*
 * @ Date: 2015.07.14
 * @ Author: Me
 * @ Story: PayBean Tester 
 */

public class PayMain {
	
	private String name;
	private int salary, tax, wage;
	
	public static void main(String[] args) {
		/* Order
		   페이 프로그램은 월급을 입력받아서 세금을 떼고 실급여를 고객에게 알려주는 프로그램
		   세율은 10%
		   출력 결과는:
		   [홍길동 실급여]
		   월급: 100 만원
		   세금: 10 만원
		   실급여: 90 만
		 */		
		
		Scanner scanner = new Scanner(System.in);
		String name = ""; // 메인에서도 내부의 지역변수
		int salary = 0, tax = 0, wage = 0;
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("월급을 입력하세요.");
		salary = scanner.nextInt();
		System.out.println("세금은 몇 % 입니까?");
		tax = scanner.nextInt();
						
		PayBean payBean = new PayBean();
		payBean.setName(name);
		payBean.setSalary(salary);
		payBean.setTax(tax);
		
		System.out.println(payBean.toString());
				
				
		
	}
}
