package ifCondition;
/*
 * @ Date: 2015.07.08
 * @ Author: Me
 * @ Story: 
 */

public class IfElse {
	public static void main(String[] args) {
		int x = 0, y = 0; // 지변 초기화
		if ((x == 1) && (y == 1)) { // &&는 앰퍼센드라고 읽고, and 연산자이다
			System.out.println("x는 1 이면서, y도 1 이다.");
			}
		
		else if ((x == 3) || (y == 4)) { // ||는 컬럼이라고 읽고, or 연산자이다
			System.out.println("x는 3 이거나, y는 4 이다.");
			}
		
		else {
			System.out.println("해당 사항이 없습니다.");
		}
}
}
