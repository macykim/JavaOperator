package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: 
*/

import java.util.Scanner;

public class Angel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		AngelCoffee kim = new AngelCoffee();
		System.out.println("설탕 첨가 여부를 알려주세요. 1: 무첨가, 2: 첨가");
		kim.prepare(scanner.nextInt());
		
		AngelTea lee = new AngelTea();
		System.out.println("무엇을 넣으시겠습니까? 1. 레몬, 2: 자몽");
		lee.prepare(scanner.nextInt());
	}
}
