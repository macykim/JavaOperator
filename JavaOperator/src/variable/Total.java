package variable;
/*
 * @ Date: 2015.07.07
 * @ Author: Me
 * @ Story: 
 */

public class Total {
	public static void main(String[] args) {
		// 국어 점수는 데이터 타입이 정수이다.
		// 변수명은 kor
		// 할당된 값은 80
		
		int kor = 85;			
		int eng = 75;
		int math = 55;
		
		// 같은 데이터 타입의 변수를 여러개 선언/할당 할 때:
		int kore = 80, engl = 70, mathe = 50;
		
		int total = 0; // 지역변수 초기화
		total = kor + eng + math; // 지역변수 연산
		
		int totale = 0;
		totale = kore + engl + mathe;
				
		System.out.println(total);
		System.out.println(totale);
		
		int korean = 60, english = 60, mathematics = 60;
		int totalle = 0;
		totalle = korean + english + mathematics;
		int avg = 0; // 평균구하기: 총점/과목수
		avg = totalle / 3;
		System.out.println(totalle);
		System.out.println(avg);
		System.out.println("총점: " + totalle);
		System.out.println("평균: " + avg);
	} 
}
