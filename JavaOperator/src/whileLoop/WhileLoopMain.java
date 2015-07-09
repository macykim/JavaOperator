package whileLoop;
/*
 * @ Date: 2015.07.09
 * @ Author: Me
 * @ Story: While Loop 문법1
 */

public class WhileLoopMain {
	// Loop: 원 단어의 뜻은 순환
	// Index 값을 통해 순환 횟수를 설정하고, Limit 값을 통해 마감 Index 까지만 회전한다.
	
	// While Loop은 Limit 값을 알 수 있는 상황과 알 수 없는 상황 두 가지 상황에 쓰인다.
	
	
	public static void main(String[] args) {
		// Limit 값이 설정된 경우:
		int idx = 1;
		while (idx < 11) {
			System.out.print(idx + "\t");
			idx++; // 단항연산식으로 기본 idx 값에 회전때마다 1씩 증가
		}				
	}
}
