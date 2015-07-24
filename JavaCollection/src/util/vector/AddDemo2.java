package util.vector;

import java.util.Scanner;
import java.util.Vector;

/*
 * @ Date: 2015.07.24
 * @ Author: 김청명
 * @ Story: java.util.Vector의 메소드 중에
 * 			추가 기능을 담당하는 add()
 */

public class AddDemo2 {
	public static void main(String[] args) {
		Vector<String> avengers = new Vector<String> ();
			// vec처럼 소문자로 시작하면 변수
	 //	vec.add("홍길동");
		String[] heroes = {"iron", "thor", "hulk", "hawk"};
			// 크기가 4인 스트링 배열의 선언과 생성
		for (int i = 0; i < heroes.length; i++) {
			avengers.add(heroes[i]);}
		
	// 자료구조는, 저장과 검색이라는 기능을 위해 만들어진 클래스이다.
	// 특정 영웅이 (iron, thor, hulk, hawk 중) avengers 회원인지 검색을 해보자.
		Scanner scanner = new Scanner(System.in);
		System.out.println("어벤저스 회원 검색. 이름을 입력하세요.");
		String hero = scanner.next();
		if (avengers.contains(hero)) {
			int idx = avengers.indexOf(hero);
			System.out.println(hero + "는 " + (idx + 1) + "번째에 있습니다.");}
		else {System.out.println(hero + "는 avengers 회원이 아닙니다.");}
	
	// 특정 영웅 삭제
		avengers.remove(0);
			// 인덱스 값을 파라미터로 전달하면 삭제 완료
	}
}
