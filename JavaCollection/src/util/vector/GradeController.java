package util.vector;
/*
 * @ Date: 2015.07.27
 * @ Author: 김청명
 * @ Story: 
 */

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		Grade hong = new Grade("1301", "홍길동", 76, 70, 50);
		Grade kim = new Grade("1302", "김유신", 80, 90, 100);
		Grade lee = new Grade("1303", "이순신", 95, 85, 60);
		
		service.input(hong);
			// Grade 타입의 인스턴스(객체)인 hong이 서비스 인터페이스를
			// 구현한 서비스임플 클래스의 input() 메소드에 할당된다.
		service.input(kim);
		service.input(lee);
		
	// 전체 학생 성적표를 출력
		service.printList();
		
}
}
