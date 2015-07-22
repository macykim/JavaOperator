package bank;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: 통장
 */

public class BankBook implements Account{
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
