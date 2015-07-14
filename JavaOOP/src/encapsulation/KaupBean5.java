package encapsulation;

import java.util.Scanner;

/*
 * @ Date: 2015.07.14
 * @ Author: Me
 * @ Story: 
 */

public class KaupBean5 {	
	public void setName(String name) {
		this.name = name;}
	
	public void setHeight(double height) {
		this.height = height;}
	
	public void setWeight(double weight) {
		this.weight = weight;}
	
	/* 
	 * 멤버 필드에 값을 저장하는 메소드가 setter라면
	 * 값을 읽어오는 메소드는 getter라고 합니다.
	 * getter는 read의 의미입니다.
	 * getter의 특징은 리턴타입이 존재하는 것으로,
	 * 특별한 상황이 아니면 parameter가 존재하지 않습니다.
	 */
	
	private String name, stat;
	private double height, weight;
	private int idx;
	
	public void getIndex() { // 메소드 (동사)
		
		idx = (int) ((weight / (height * height)) * 10000);
		
		if (idx > 30) {stat = "비만";}
			else if (idx > 24) {stat = "과체중";}
			else if (idx > 20) {stat = "정상";}
			else if (idx > 15) {stat = "저체중";}
			else if (idx > 13) {stat = "마름";}
			else {stat = "영양실조";}	
			//return stat;
			}
	
	@Override
	public String toString() {
		// 선언부
		String str = "";
		
		// 연산부
		str = "[" + name + "]" + " 키: " 
				+ height + "cm, " + "몸무게: " + weight + "kg, " + "카우프지수: " + idx + ", " + stat; // 지역변수는 무조건 초기화
				
		// 출력부
		return str;
	}
}
