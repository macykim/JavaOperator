package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 생성자 문법
  			생성자는 setter를 통해 값을 할당하는 기능을 보강하여
  			객체가 만들어짐과 동시에 값을 할당하도록 특수하게 만들어진 ★메소드
 */

public class CardBean3 {
/*====================================== Field ====================================== */	
	// 멤변이 되므로 초기화 하지 않음. 보안이 필요하므로 private을 줌
	private String name1, name2; 
	private int num1, num2;
	
/*=================================== Constructor =================================== */
	// 생성자 위치는 (멤버) 필드와 메소드 영역 사이에 위치
	// 생성자 모양
	// public 클래스이름() {}
	public CardBean3() {} // 디폴트 생성자		
	public CardBean3(String name) {
		// setter 역할을 겸용하는 생성자
		this.name1 = name;
		this.num1 = (int) ((Math.random()*13)+1);;}
	// TODO Auto-generated constructor stub

	// 디폴트 생성자는 개발자가 직접 만들지 않아도
	// 프로그램 내부에서는 생성되 있는 것으로 인식한다.
	// 그런데, 이것을 꺼내 든 이유는,
	// new keyword를 통한 객체생성 역할 뿐만이 아니라
	// 생성과 동시에 값을 할당하는 기능을 추가 시키기 위함이다.
	
/*====================================== Method ====================================== */
	public String getName() {
		return name1;}
	
	public int getNum() {
		return num1;}
	
	public String getWinner() {
		// getter에서 문제해결 패턴
		// 제일 먼저 리턴타입 카피 후 초기화
		String winner = "";
		if (num1 > num2) {winner = name1 + " Win!";}
		else if (num2 > num1) {winner = name2 + " Win!";}
		else {winner = "동점!";}		
		return winner;}
	
	@Override
	public String toString() {
		return ("[" + name1 + ": " + num1 + "]"
				+ "vs [" + name2 + ": " + num2 + "]"
				+ "\n" + this.getWinner());
	
	}
}