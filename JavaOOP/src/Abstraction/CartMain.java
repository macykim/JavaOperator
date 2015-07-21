package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 카트에 담은것 보여주는 displayer
*/

public class CartMain {
	public static void main(String[] args) {
		Television samsungTV = new Television();
			samsungTV.writeInfo("Samsung", "Wide-Screen TV", "SAM15423SG", "42Inch", "LED");
		
		Laptop lgLaptop = new Laptop();
			lgLaptop.writeInfo("LG", "Gram", "LG880909", "Dual-Core", "8GB", "500GB");
		
		// 인터페이스는 생성자가 없기 때문에 new를 쓸 수 없으나 생성자를 사용하지
		// 않는 인터페이스라도 타입으로 사용하기 위해 배열을 선언하는 것은 가능하다.				
		Product[] cart = new Product[2];
			// 인터페이스를 사용하는 이유 2번째:
			// 타입으로 통합을 해야하는 클래스들의 집합이 필요한 상황에서
			// 각각의 클래스를 하나의 컬렉션에 담는 역할을 한다.
		
		cart[0] = samsungTV;
		cart[1] = lgLaptop;
		// 배열을 출력할 때는 무조건 for-loop 인데
		// 카트 내부에 있는 객체를 선언해야 할 필요가 존재한다.
		
		// for (int i = 0; i < cart.length; i++) {}				
		
		// 이 상황에서는 확장된 for문이 있는데 그걸 사용한다.		
		// 확장된 for문: for (인터페이스타입 인스턴스 : 배열명) {}
		for (Product product : cart) {
			product.showInfo();
		}
		
	}
}
