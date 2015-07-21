package Abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: tv
*/

public class Television extends ProductSpec {
	// 주어진 것만 하라고 했으면, ProductSpec에서 마무리가 되었을 것
	// 시키는 것만 하는것: implements
	// 추가로 더 하는것: extends로, 상속
	private String screenSize;
	private String screenType;
	
	public void writeInfo(String company, String name, String serialNo,
			String screenSize, String ScreenType){
		// remove @ Override annotation: 니 부모 클래스에는 이런 다섯개의 클래스가 존재하지 않음.. 이라는 뜻
		super.writeInfo(company, name, serialNo);
			// 부모에게 선언된 public 메소드에 접근, 사용가능
			// super 라는 키워드를 통해서...
		this.screenSize = screenSize;
		this.screenType = ScreenType;
	}
	
	@ Override
	public void showInfo(){
		super.showInfo();
		System.out.println("스크린 사이즈:" + this.screenSize);
		System.out.println("스크린 타입: " + this.screenType);
	}
}
