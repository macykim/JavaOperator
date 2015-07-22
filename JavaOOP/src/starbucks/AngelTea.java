package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: StarbucksTea를 발전시킨 버전
*/

public class AngelTea extends DrinkRecipe{
	private String tea;
/*
 * extends는 CTRL + Space로 @Override를 호출하라고 했는데...
 * 그것은 extends 클래스가 일반 클래스인 경우이고,
 * 추상클래스는 일반클래스 + 인터페이스 형태이므로
 * 인터페이스의 특징을 갖게 된다. 따라서, extends 이지만
 * 부모 클래스가 추상클래스라면 unimplement를 해줘야 한다.
 */
	
	@Override
	void brew() {
		System.out.println("티백을 내린다");
	}

	@Override
	void select(int option) {
		switch (option) {
		case 1: this.tea = "레몬"; break;
		case 2: this.tea = "자몽"; break;
		default: this.tea = "선택오류"; break;}
	}

	@Override
	void serve() {
		System.out.println("고객님 [" + this.tea + "] 티가 나왔습니다. \n");
	}

}
