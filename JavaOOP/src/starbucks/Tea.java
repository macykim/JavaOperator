package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: coffee-making 예제에 추가되어 tea-making 예제까지 포함한 추상클래스 학습
*/

public class Tea implements Recipe{
	private String tea;
	
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다.");}
	
	@Override
	public void brew() {
		System.out.println("티백을 내린다");}
	
	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다");}
	
	public void select(int option) {
		switch (option) {
		case 1: this.tea = "레몬"; break;
		case 2: this.tea = "자몽"; break;
		default: this.tea = "선택오류"; break;}
			// 만약 Coffee에서도 switch case를 썼어도,
			// 스캐너가 다르므로 둘 다 1, 2를 써도 무관함		
	}	
	
	@Override
	public void serve() {
		System.out.println("고객님 [" + this.tea + "] 티가 나왔습니다. \n");}
}
