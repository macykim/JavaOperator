package encapsulation;
/*
 * @ Date: 2015.07.16
 * @ Author: 김청명
 * @ Story: 랜덤하게 1부터 6까지 출력함
 */

// Dice는 랜덤하게 돌려주는 것 밖에 하지 않음

public class Dice {		
/*====================================== Field ====================================== */	
	private int num;
	// dice1, dice2를 쓰지 않는 이유: Dice라는 이 class 자체가 주사위 하나이고,
	// dice1, dice2라는 variable을 만드는 순간 주사위 안에 주사위를 또 파내어 숫자 두개를 만들려고 하는 것임.
	// 현실적으로 생각해 보면 주사위 하나는 숫자 하나만 뽑아낼 수 있을 뿐,
	// 숫자 두개를 파내어 두개의 숫자를 보여줄 수는 없음.
	
/*=================================== Constructor =================================== */
	public Dice() {
		this.num = (int) ((Math.random()*6)+1);
	} // 디폴트 생성자		
	
/*====================================== Method ====================================== */
	public int getNum() {return num;}
	
}