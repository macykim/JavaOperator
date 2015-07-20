package Inheritance;
/*
 * @ Date: 2015.07.20
 * @ Author: 김청명
 * @ Story: extended version of cellphone--cellphone에 성능 추가
 */

public class Iphone extends Cellphone{
/*=====================필드=====================*/
	private String data;
	private String os; // 운영체제
	public static boolean PORTABLE = true;
		// 오로지 이동전화만 만드는 회사
	public static String BRAND = "아이폰";
		// 브랜드를 static이라는 키워드를 사용해서 클래스변수로 만들고 아이폰을 고정값으로 설정함
	
/*====================생성자====================*/
	
	
/*==================멤버메소드==================*/
	public String getData() { // 정해놓은 값을 읽어오기만 함
		return data;}
	
	public void setData(String name, String data) {
		// get/set 에 관계 없이 parameter를 추가하는 정도의 변화는 개발자의 재량에 있다.
		this.data = name + "에게 메시지로 " + data + "를 전달";}

	public String getOs() {
		return os;}

	public void setOs(String os) {
		this.os = "iOS";}
	
	
}