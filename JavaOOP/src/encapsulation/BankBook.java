package encapsulation;
/*
 * @ Date: 2015.07.16
 * @ Author: 김청명
 * @ Story: 통장
 */

import abstraction.Account;

/* 
 * OOP에서 클래스는 현실 세계를 그대로 카피하려고 한다.
 * 그 대상이 구체적인 물질이던, 개념적 추상이던 그대로 재현하려고 해야 한다. 
 * 통장을 이루는 요소를 생각해 봅시다.
 * 그 요소가 결국 인스턴스 변수를 구성하게 됩니다.
   1) 은행이름 => 아이티뱅크 bank
   2) 계좌번호 => 5자리 랜덤숫자 bankbookNo
   3) 소유주이름 => 생성자의 스캐너로 입력받는 값 name
   4) 날짜 / 예금액 / 출금액 / 잔액 => 돈은 스캐너로 입력받는 값으로, 숫자타입 int => money
   5) 비밀번호 => 스캐너로 입력받는 값, 숫자타입, 4자리 => pass
 
 * 인터페이스
	1. withdraw(int money): void
	2. deposit(int money): void
  
 * 출력 결과는
   =============== 
   [아이티뱅크]
   계좌번호: 12345
   이름: 홍길동
   잔액: 1000원  
   =============== 
   
   BankBook 이라는 클래스 라이브러리를 N드라이브에서 다운받아서 사용하세요.
   비번은 돈 먼저 입금하세요. -> java는 출장이 필요 없음. 
   C언어는 출장가야함.
   
 */
public class BankBook implements Account{
		// 상수: final을 붙여서 절대 불변의 값을 만든다.
		// 스태틱: final을 빼버리면 절대 불변의 값이 아니라 바꿀 수 있지만, 고정된 값--스태틱 값이 된다.
			// 스태틱 = 클래스 변수. 인스턴스 없이 클래스가 바로 호출할 수 있게 하는 것
			// BankBook b = new BankBook();
			// b.bank ==> 인변이 값을 호출한 것
			// BankBook.bank ==> 클래스 변수가 값을 호출하는 모양
		// 위치: 필드 ==> {인변 상수, 클래스변수} < 멤변

/*============================================= 멤버필드 =============================================*/
	public static String BANK;
		// 이름이 대문자 일 경우 "고정된 값 혹은 스태틱" 이구나 하고 assume함.
	private int bankbookNo;
	private String name;
	private int money;
	private int pass;
	private String msg;
		// 유효성체크 결과를 알려주어 고객이 만약 입력실수를 범했다면 공지해주는 기능
	
	public BankBook(String name){
		this.BANK = "아이티뱅크";
		this.bankbookNo = (int) ((Math.random()*9999)+10000);
			// this.bankbookNo = (int) ((Math.random()*START)+END???);
		this.name = name;
			// 외부에서 스캔을 받아야 되겠구나 하고 나면... 
			// public BankBook() <== () 안에 String name을 넣어야 함
			// 여기서 보면 money도 받아와야 하는데.. 이 케이스에서는 () 안에 money는 넣으면 안됨.
		this.money = money;
	}
		
	// 개발자는 setter를 쓸지, 생성자로 끝낼지를 고민해야함 
		// getter & setter 는 메소드임
	
/*============================================ 멤버메소드 ============================================*/
	@Override
	public String toString() {
		return "===============\n"
				+ "[" + BANK + "]\n"
				+ "계좌번호: " + bankbookNo + "\n"
				+ "이름: " + name + "\n"
				+ "잔액: " + money + "원\n"
				+ "===============";}

	public int getBankbookNo() {
		return bankbookNo;}

	public String getName() {
		return name;}

	public int getMoney() {
		return money;}
	
	public int getPass() {
		return pass;}

	/* public void setBankbookNo(int bankbookNo) {
		this.bankbookNo = bankbookNo;
	}*/ // 이 케이스에서 계좌는 바뀌면 안됨. setter로 바꿀수 있기 때문에 보안상 제거하는게 맞음
	
	/* public void setName(String name) {
		this.name = name;
	}*/ // 얘도 지워야 함. 이름 바뀌면 안되니까.
	
	/*public void setMoney(int money) {
		this.money = money;}*/
	
	public void setPass(int pass) {
		this.pass = pass;}
	
	@Override
	public void withdraw(int money){
		if (money <= 0) {msg = "출금액은 0보다 커야 합니다.";}
			else if (this.money < money){msg = "출금액이 잔액보다 큽니다.";}	
			else {this.money -= money;} // -= ==> 누적된 값에서 차감
	}
	
	@Override
	public void deposit(int money){
		if (money <= 0) {msg = "입금액은 0보다 커야 합니다.";}
			else {this.money += money;}
		
	}
	
}