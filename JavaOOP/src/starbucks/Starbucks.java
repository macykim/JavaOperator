package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: Recipe (Coffee & Tea) Tester
*/

import java.util.Scanner;

public class Starbucks {
	public static void main(String[] args) {		
		Recipe coffee = new Coffee();
			/* 
			 * 인터페이스를 구현한 클래스의 객체 생성 문법
		   	   - 인터페이스이름 인스턴스 = new 생성자();
		   	   홍차를 추가할때 Coffee coffee = new Coffee(); 면 홍차를 추가할 수 없음....
		   	   extends와 implements의 상황에 따라 Coffee coffee & Recipe coffee가 되므로 주의할 것...
		   	 */
		
		coffee.boilWater();
		coffee.brew();
		coffee.pourInCup();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("설탕 첨가 여부를 알려주세요. 1: 무첨가, 2: 첨가");
	//	int option = scanner.nextInt();		
	//	coffee.select(option); 이 두줄이 아래 한줄이랑 같음
		coffee.select(scanner.nextInt());
		coffee.serve();
		
		Recipe tea = new Tea();
		tea.boilWater();
		tea.brew();
		tea.pourInCup();
		System.out.println("무엇을 넣으시겠습니까? 1. 레몬, 2: 자몽");
		tea.select(scanner.nextInt());
		tea.serve();
		
	}

}
