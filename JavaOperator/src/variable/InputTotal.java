package variable;

 /*
 * @ Date: 2015.07.07
 * @ Author: Me
 * @ Story: 
 */
import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int kor = 0, eng = 0, math = 0, total = 0; //디폴트 값 선언: 지역변수 초기화
		
		// int kor, eng, math, total; -> 인스턴스 변수 선언법
				
		System.out.println("국어점수를 입력하세요");
		kor = scanner.nextInt();
		
		System.out.println("영어점수를 입력하세요");
		eng = scanner.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		math = scanner.nextInt();
		
		// total 지역변수를 연산식으로 초기화 함
		total = kor + math + eng;
		
		//결과값 리턴
		System.out.println("총점: " + total);
		
		
	}
}
