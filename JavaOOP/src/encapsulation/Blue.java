package encapsulation;
/*
 * @ Date: 2015.07.16
 * @ Author: 김청명
 * @ Story: Game-Monopoly System
 */

// Blue는 Dice에서 랜덤하게 돌려준 숫자를 더해주는 역할

public class Blue {
/*====================================== Field ====================================== */
	private int sum;

/*=================================== Constructor =================================== */	
	public Blue(Dice dice1, Dice dice2) {
		// 생성자 parameter 2개 (주사위)를 합친 값	
		this.sum = dice1.getNum() + dice2.getNum();
	}	
		
/*=================================== MemberMethod =================================== */
	public int getSum() {
		return sum;
	// ^ 왜 이게 없어도 값이 나옴????
	// Constructor에서 썸 받고 return으로 return했기때문에 지금 배운것으로는 필요가 없음?????
	// 아래 return은 full name with address라고 보면 되고, 위에는 그냥 심플하게 first name이라고 보면 되나?
	// 하지만 꼭 필요하지 않으므로 없애도 됨.	
		
	}
	@Override
	public String toString() {
		return "두 주사위의 합은 " + this.sum + "입니다. " + this.sum + "칸 전진하세요.";}
}

