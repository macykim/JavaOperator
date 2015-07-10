package condition;
/*
 * @ Date: 2015.07.10
 * @ Author: Me
 * @ Story: Switch-Case 
 */

public class SwitchCase {
	public static void main(String[] args) {
		/*
		 *  flag이라는 변수는 기준값이란 의미로
		 *  스위치 문에서 조건제어 변수로 많이 사용됨
		 *  범위 문제로 if-else보다 빠름. 특정 값을 제한함.
		 *  그러나 if-else가 == 를 사용할때만. 부등호는 제외
		 */
		
		int flag = 3;
		
		switch (flag) {
		case 1: System.out.println("1"); break;
		case 2: System.out.println("2"); break;
		case 3: System.out.println("3"); break; // case 값은 중복되면 안됨
		default: System.out.println("1부터 3 범위 밖의 숫자"); break;
		}
	}
}