package bank;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: 은행 관리자가 가진 기능
 */

public interface BankRole {
	
	// 계좌 개설 기능
	public void openAccount(String accountNo, // 계좌번호
			String ownerName, // 계좌주 이름
			String password, // 비밀번호
			int restMoney); // 잔액
	
	// 계좌번호를 입력하면 계좌 내용이 출력되어야 함	
	public abstract Account searchAccountByAccountNo(String accountNo);
	
	// 계좌주 이름을 입력하면 그사람 소유의 계좌가 전부 검색 된다.
	// 단, 동일인이 다수의 계좌를 가질 수 있다.	
	public Account[] searchAccountByName(String ownerName);
	
	// 계좌주 이름을 입력하면 그 사람 소유의 계좌 갯수를 알려준다.
	public int searchCountByName(String name);
	
	// 계좌번호로 특정 계좌를 폐기하는 기능
	public boolean closeAccount(String accountNo);
}
