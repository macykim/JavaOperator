package condition;
/*
 * @ Date: 2015.07.08
 * @ Author: Me
 * @ Story: and & or 연산자
 */

public class OnlyIf {
	public static void main(String[] args) {
		int x = 0, y = 0; // 지변 초기화
		if ((x == 1) && (y == 1)) { // &&는 앰퍼센드라고 읽고, and 연산자이다
			System.out.println("x는 1 이면서, y도 1 이다.");
			}
		
		if ((x == 1) || (y == 2)) { // ||는 컬럼이라고 읽고, or 연산자이다
			System.out.println("x는 1 이거나, y는 2 이다.");
			}
		
	}
}
