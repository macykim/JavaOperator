package Inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: iphone inheriter android
 */

/* 객체지향언어 2) 상속의 문법
   1) 순수상속: 부모에게 선언된 필드, 메소드를 그대로 사용하기
      위해서 자식클래스에는 별도로 추가하지 않는다
   2) 오버라이딩: 부모에게 선언된 필드, 메소드를 그대로
      사용하지 않고 약간의 변형을 시킨 후 재사용하는 문법
   ===> 이런 식으로 상속을 하되, 다양하게 변화를 시키는 패턴을 객체지향언어(4) 다양성 이라고 한다.
        다양성은 상속 뿐 아니라, 추상화와 생성자 문법에서도 나타난다.
 */

public class AndroidPhone extends Iphone {
	public static String BRAND = "안드로이드";
	private String os;
	private String data;
		
	@Override
	public String getOs() {
		 // super.getOs();
		 return os;}
	
	@Override
	public void setOs(String os) {
		this.os = "android";}
	
	@Override
	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.isPortable();
		super.setCall(name);
		// super.setData(name, data);
		this.data = super.getCompany() + "\n" + super.getCall() + "\n" + this.getOs() + "\n" + data + ": 카톡 메세지 전달";
	}
	
	@Override
	public String getData() {
		return data;}

}

