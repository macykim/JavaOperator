package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 추상화 + 다양성의 결합형태를 보는 예제
			객체 지향 언어에서 다양성의 핵심원리
			- 인터페이스를 구현하는 클래스들은 그 인터페이스 타입에 포함이 된다.
			- 다음과 같은 상속의 예에서 class Child extends Parent 가 있다고 하면
			  Child가 Parent의 타입에 포함(종속)된다. 이처럼 인터페이스도
			  그를 구현(implement)한 인터페이스 타입에 포함된다.
*/
public interface FruitsInterface {
	// 인터페이스에서는 get/set을 쓰지 않음. 
	// 필드 없음, 생성자 없음. 오로지 추상메소드만 존재함
	

	public void display(String str);
	
}
