package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 추상적인 제품이라는 개념을 인터페이스로 만듬
*/

public interface Product {
	public void showInfo();
	public void writeInfo(String company, String name, String serialNo);
}
