package bank;
/*
 * @ Date: 2015.07.23
 * @ Author: 김청명
 * @ Story: 
 */

import java.util.Scanner;

public class KbBank {
	public static void main(String[] args) {		
		BankRole bank = new Bank(100);
			// 인터페이스를 구현한 것이기 때문에 인터페이스 형태로 가지고 와야 함
			// 인터페이스타입 인스턴스 = new 생성자();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("고객님 성함?");
		String name = scanner.next();
		System.out.println("비밀번호 4자리?");
		int password = scanner.nextInt();
		System.out.println("얼마를 입금하시겠습니까?");
		int money = scanner.nextInt();		
		bank.openAccount(name, password, money);
		System.out.println("====계좌번호 조회(계좌번호)====");
		System.out.println("검색하려는 고객명?");
		String searchName = scanner.next();
		int searchCount = bank.searchCountByName(searchName);
		BankBook[] searchArr = new BankBook[searchCount];
		searchArr = bank.searchAccountByName(searchName);
		
		for (BankBook bankbook : searchArr) {
			System.out.println(bankbook.showAccount());}
		
		System.out.println("검색하려는 계좌번호?");
			// 객체가 메소드를 호출한 후, 연산을 통해 결과를 리턴하였지만
			// 그 리턴값을 받는 변수처리는 개발자가 별도로 해줘야 한다 (↓)
		BankBook bankBook = bank.searchAccountByAccountNo(scanner.next());
			// 그 방법은 메소드가 리턴하는 리턴타입을 알아내서 그 타입으로
			// 변수 하나를 만든 다음, 그 변수에 리턴 값을 할당한다.
		System.out.println(bankBook.showAccount());
		System.out.println("삭제하려는 계좌번호?");
	//	String delete = scanner.next();
			// "12345"와 12345는 비교 불가. int와 String의 값을 서로 비교하려면
			// String 타입을 int 타입으로 바꿔줘야 한다.
			// int one = String.valueOf("12345"); 의 결과값은 12345	
	//	String deleteAccount = String.valueOf(delete);
	//	bank.closeAccount(deleteAccount);
		boolean closeOk = bank.closeAccount(scanner.next());		
		if (closeOk == true) {System.out.println("삭제되었습니다.");}
		else {System.out.println("해당 계좌가 없습니다.");}
		
	}
	
	
	
}
