package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 랜덤하게 뽑은 카드 비교 프로그램 
 */

public class CardBean2 {
	// 멤변이 되므로 초기화 하지 않음. 보안이 필요하므로 private을 줌
	private String name1, name2; 
	private int num1, num2;
	
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
	
	public void setNum1() // (int num1) <- parameter 제거 
		// 외부에서 받는 숫자가 없으므로 parameter가 필요 없다.
		{this.num1 = (int) ((Math.random()*13)+1);}
		// 1부터 3까지의 정수 중에서 랜덤 숫자를 리턴

	public void setNum2() // (int num2) <- parameter 제거
		// 외부에서 받는 숫자가 없으므로 parameter가 필요 없다.
		{this.num2 = (int) ((Math.random()*13)+1);}
	
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