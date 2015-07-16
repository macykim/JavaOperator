package encapsulation;
/*
 * @ Date: 2015.07.16
 * @ Author: 김청명
 * @ Story: 통장
 */

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
 * 출력 결과는
   =============== 
   [아이티뱅크]
   계좌번호: 12345
   이름: 홍길동
   잔액: 1000원  
   =============== 
 */
public class BankBook {
	private String name;
	
	@Override
	public String toString() {
		return "===============\n"
				+ "계좌번호: " + bankbookNo + "\n"
				+ "이름: " + name + "\n"
				+ "잔액: " + money + "원\n"
				+ "===============";
	}
}