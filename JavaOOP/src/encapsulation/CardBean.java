package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 카드 비교 프로그램 
 */

public class CardBean {
	// 멤변이 되므로 초기화 하지 않음. 보안이 필요하므로 private을 줌
	private String name1, name2; 
	private int number1, number2;
	
	public void setName1(String name1) {
		// () 안에 값을 parameter라고 하고 소속은 지변이다.
		this.name1 = name1;}
		// this.name은 인스턴스변수 (멤변)이고
		// = name은 parameter로 넘어온 지변 (스캐너가 받은 값)
		// 스캐너가 받아 놓은 값을 가진 지변 값을
		// 멤변 name에 할당하라.
		// parameter값과 멤변값의 이름은 달라도 상관없다..
		// 단, 데이터타입 (String, int)는 반드시 일치해야 한다.
	public void setName2(String name2) {
		this.name2 = name2;}
	public void setNumber1(int number1) {
		this.number1 = number1;}
	public void setNumber2(int number2) {
		this.number2 = number2;}
	
	public String getWinner() {
		// getter에서 문제해결 패턴
		// 제일 먼저 리턴타입 카피 후 초기화
		String winner = "";
		if (number1 > number2) {winner = name1 + " Win!";}
		else if (number2 > number1) {winner = name2 + " Win!";}
		else {winner = "동점!";}		
		return winner;}
	
	@Override
	public String toString() {
		return ("[" + name1 + ": " + number1 + "]"
				+ "vs [" + name2 + ": " + number2 + "]"
				+ "\n" + this.getWinner());
	
	}
}