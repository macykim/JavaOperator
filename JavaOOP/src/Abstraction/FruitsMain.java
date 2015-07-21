package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 
*/

public class FruitsMain {
	public static void main(String[] args) {
		/*
		 1) ★★★ 인터페이스는 객체를 만들 수 없다. 
		    FruitsInterface f = new f.. (); -> 생성자가 없기 때문에 이걸 할 수 없음.
		 2) [중요 문법]
		    인터페이스를 구현한 클래스의 객체생성은
		    인터페이스명(타입) 인스턴스 = new 생성자();
		 */
		
		FruitsInterface apple = new Apple();
			// FruitsInterface apple = new FruitsInterface(); <= 이건 불가하나
			// FruitsInterface apple = new Apple(); 		  <= 은 됨
			// Apple ap new Apple(); <= 에러는 안나지만 추천하지 않음
		FruitsInterface banana = new Banana();
		FruitsInterface orange = new Orange();
		
		apple.display("맛있는 ");
		banana.display("오래된 ");
		orange.display("비싼 ");
	    /* orange.count();		 
		   인터페이스 타입으로 선언되어 생성된 객체(인스턴스)에서 인터페이스에
		   선언되지 않은 메소드를 호출할 지라도 그 메소드는 호출되지 않는다.
		   이처럼 하지 안흔 이유는, 기획자(아키텍처--개발자 10년이상)가 일선 개발자들이
		   자기 마음대로 메소드를 선언하여 기획자 의도에서 벗어나는 것을 막고,
		   주어진 메소드를 통해 코드를 구현하는 것을 암묵적으로 제약, 지시 한다.
		*/
	}
}
