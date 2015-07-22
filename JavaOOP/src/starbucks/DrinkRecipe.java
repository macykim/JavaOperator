package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: 추상클래스 학습
 			추상메소드를 가지고 있는 것은 인터페이스와 동일하나,
 			구상메소드({}를 가지고 있는 것)도 추가로 가질 수 있고,
 			객체 생성시 개발자 마음대로 메소드를 추가하여도 문제가 없다.
*/

public abstract class DrinkRecipe {
	public void prepare(int option) {
		boilWater();
		brew();
		pourInCup();
		select(option);
		serve();
	}
	
	private void boilWater() {
		// 공통일 경우 abstract를 지우고 {}를 준다.
		// 그리고 그 안에 공통문구나 공통적인 부분을 채워 넣는다.
		System.out.println("물을 끓인다.");};
	abstract void brew();
		// 추상 메소드는 private을 허용하지 않는다.
		// 외부에서의 접근 금지를 설정하려면 디폴트 상태 혹은 기본상태로 둔다.
		// 즉, public을 지운다.
	private void pourInCup() {
		System.out.println("물을 컵에 붓는다.");};
	abstract void select(int option);
	abstract void serve();
	
}
