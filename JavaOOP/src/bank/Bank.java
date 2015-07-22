package bank;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story:
 */

public class Bank implements BankRole{
	/* 클래스의 구성...
	   ====== 필드 ======
	   ===== 생성자 =====
	   === 멤버메소드 ===
	 */
	
// ========================== 필드 ==========================	
	
// ========================= 생성자 =========================
	public Bank() {}
	
// ======================= 멤버메소드 =======================
	// 계좌개설
	@Override
	public void openAccount(String accountNo, String ownerName, String password, int restMoney) {
	}

	// 계좌검색 (계좌번호 사용) -> 리턴결과: 계좌 1개
	@Override
	public Account searchAccountByAccountNo(String accountNo) {		
		Account account = null;
		return account;
	}

	// 계좌검색 (이름 사용) -> 리턴결과: 계좌 갯수
	@Override
	public Account[] searchAccountByName(String ownerName) {		
		Account[] accounts = null;
		return accounts;
	}

	// 계좌검색 (이름 사용) -> 리턴결과: 숫자
	@Override
	public int searchCountByName(String name) {		
		int count = 0;
		return count;
	}

	// 계좌해지 -> 리턴결과: true or false
	@Override
	public boolean closeAccount(String accountNo) {
		boolean flag = false;
		if (flag) {
			
		} else {

		}
		return flag;
	}

}
