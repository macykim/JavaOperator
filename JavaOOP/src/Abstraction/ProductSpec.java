package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 인터페이스인 Product를 구현한 클래스
*/

public class ProductSpec implements Product{
/*======================================필드======================================*/
	// 필드에 있는 녀석은 인스턴스 변수. 초기화를 하지 않는다.
	private String company;  // 제조사
	private String name;     // 제품명
	private String serialNo; // 시리얼넘버

/*=====================================생성자=====================================*/					
					
/*===================================멤버메소드===================================*/
	@Override
	public void showInfo() { // get의 형태
		System.out.println("제조사: " + this.company);
		System.out.println("제품명: " + this.name);
		System.out.println("시리얼넘버: " + this.serialNo);
	}
	
	@Override
	public void writeInfo(String company, String name, String serialNo) {
		this.company = company; // 필드에서 외부에서 들어온 값 할당하기
		this.name = name;
		this.serialNo = serialNo;
			// 파랑색 글씨는 인스턴스 변수
			// 갈색 글씨는 파라미터로 넘어온 지역 변수
	}	
}
