package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 
 */
public class CardGame {	
	private String winner; // 멤변 선언
	private int number1, number2;
	
	// 생성자 단축키
	// CTRL + space	
	public CardGame() {} // 디폴트 생성자
		// getter에서 문재해결 패턴
		// 제일 먼저 리턴타입을 카피
	
	public CardGame(CardBean3 game1, CardBean3 game2) {
		String winner = "";
		if (game1.getNum() > game2.getNum()) {winner = game1.getName() + " Win!";}
		else if (game2.getNum() > game1.getNum()) {winner = game2.getName() + " Win!";}
		else {winner = "동점!";}		
		this.winner = winner;}
	
	public String getWinner() {
		return winner;}
	}

