package array;
/*
 * @ Date: 2015.07.13
 * @ Author: Me
 * @ Story: 문자열형(String) 배열 예제
 */

public class StringArrayDemo {
	public static void main(String[] args) {
		/* 
		   자바에서 배열문법
		   1) 무조건 같은 Type
		   2) 배열의 크기가 있어야 함
		   3) 배열 크기는 객체.length
		   4) 배열은 new로 생성하고, 메모리영역 heap에 할당
		   5) 배열 출력은 for 문으로 함
		 */
		
		String[] strArr = new String[3];
		strArr[0] = "1"; // 리터럴 타입 1을 첫번째에 할당
		strArr[1] = "2"; // 리터럴 타입 2를 두번째에 할당
		strArr[2] = "3"; // 리터럴 타입 3을 세번째에 할당
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(i + "\t"); // 이렇게 하면 index 값이 출력 됨
			
			System.out.print(strArr[i] + "\t"); // 이렇게 해야 리터럴 값이 출력 됨
			
		}
		
		
	}
}
