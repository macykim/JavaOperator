package bank;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: 사용자 입장에서 계좌 관리하는 기능을 가진 인터페이스
*/

public interface Account {
	public void setPass(int pass); // 비밀번호
	public void deposit(int money); // 예금
	public abstract void withdraw(int money); // 출금
	public String showAccount(); // 계좌출력
	
	
}