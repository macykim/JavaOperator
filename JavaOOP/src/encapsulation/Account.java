package encapsulation;
/*
 * @ Date: 2015.07.16
 * @ Author: 김청명
 * @ Story: 은행 계좌
 */

public class Account {
	/* 1) 은행이름 => 아이티뱅크 bank
	   2) 계좌번호 => 5자리 랜덤숫자 bankbookNo
	   3) 소유주이름 => 생성자의 스캐너로 입력받는 값 name
	   4) 날짜 / 예금액 / 출금액 / 잔액 => 돈은 스캐너로 입력받는 값으로, 숫자타입 int => money
	   5) 비밀번호 => 스캐너로 입력받는 값, 숫자타입, 4자리 => pass
	 * 출력 결과는
	   =============== 
	   [아이티뱅크]
	   계좌번호: 12345
	   이름: 홍길동
	   잔액: 1000원  
	   =============== 
	 */
	private String bank;
	private int bankbookNo;
	
	public Account() {this.bankbookNo = (int) ((Math.random()*5)+1);}
	
	/*====================================== Method ====================================== */
	public String getbank() {return bank;}
	public int getBankbookNo() {return bankbookNo;}		
	}
	
	
