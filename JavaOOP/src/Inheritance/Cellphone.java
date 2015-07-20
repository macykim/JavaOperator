package Inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: OOP 4대특징 중 2) 상속으로
 			extends라는 키워드로 부모역할을 하는 클래스를 선언하면 자식클래스는
  			부모클래스의 자산(필드+메소드)을 따로 선언하지 않아도 사용 가능
 */

public class Cellphone extends Phone{// 기존 클래스를 확장
/*=====================필드=====================*/
	private boolean portable; // 이동이 가능한지 여부	
	private String move; // 가지고 다니는 상황을 표시하기 위한 variable
/*====================생성자====================*/
		
/*==================멤버메소드==================*/ // getter/setter 정도만
	public boolean isPortable() {
		// 타입이 boolean일때, set은 그대로이지만, get은 is로 바뀜
		// 이 경우는 "반드시" 리턴타입의 지역변수를 선언하고,
		// if-else 알고리즘을 구현해야 한다.
		//boolean 
		return portable;
	}
	
	// if-else로 참, 거짓을 판별하는 알고리즘을 구현하려면
	// parameter로 들어오는 값이 있어야 그 값에 대한 판별을 할 것이므로
	// 이 상황에서는 setter에 구현한다.
	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");}
		else {this.setMove("폰을 가지고 다닐 수 없음");}			
	}

	public String getMove() {
		return move;}

	public void setMove(String move) {
		this.move = move;}
}
