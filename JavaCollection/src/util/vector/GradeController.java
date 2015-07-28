package util.vector;

import java.util.Scanner;

/*
 * @ Date: 2015.07.27
 * @ Author: 김청명
 * @ Story: 
 */

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		/*===== 개발과정에서 테스트를 위한 임시값: 더미값 (dummy) 여기서부터 =====*/
		Grade hong = new Grade("1301", "홍길동", 76, 70, 50);
		Grade kim = new Grade("1302", "김유신", 80, 90, 100);
		Grade lee = new Grade("1303", "이순신", 95, 85, 60);		
		service.input(hong);
			// Grade 타입의 인스턴스(객체)인 hong이 서비스 인터페이스를
			// 구현한 서비스임플 클래스의 input() 메소드에 할당된다.
		service.input(kim);
		service.input(lee);
		/*====== 개발과정에서 테스트를 위한 임시값: 더미값 (dummy) 여기까지======*/	
	
	/*==================== 지시값을 전달할 스캐너 ====================*/
		// 스캐너는 while loop 밖에 장착되어야 함
		Scanner scanner = new Scanner(System.in);
		int input = 0, key = 0;
			// 메소드 안에 할당되었으므로 지역변수이다. 그러므로 초기화 해야 한다.
		
	/*========================= 무한루프 엔진 =========================*/
		while (true) {
			/*============================== 메뉴판 ==============================*/
			System.out.println("1. 성적입력\n2. 성적조회(학번)\n3. 성적조회(이름)\n4. 전체성적\n5. 성적순\n6. 이름순\n0. 종료");
			input = scanner.nextInt();
			/*===================== 입력값 체크 (Validation) =====================*/
			key = inputCheck(input, 0, 6);
				// 이걸 통해서 들어온 값이 0부터 6까지 확인하고, 0-6사이가 아닐 경우 0을 눌러 바로 시스템 종료를 실행한다.
			if (input != 0) {
				switch (key) {
				case 1: // 1. 성적입력 
					System.out.println("학번: ");
					String hakbun = scanner.next();
					System.out.println("이름 :");
					String name = scanner.next();
					System.out.println("국어 : ");
					int kor = scanner.nextInt();
					System.out.println("영어 : ");
					int eng = scanner.nextInt();
					System.out.println("수학 : ");
					int math = scanner.nextInt();
					Grade grade = new Grade(hakbun, name, kor, eng, math);
					service.input(grade);
					break; 					
				case 2: // 2.성적조회(학번)
					System.out.println("학번: ");
					System.out.println(service.searchGradeByHakbun(scanner.next()));											
					break; 
				case 3: // 3.성적조회(이름) 
					System.out.println("이름: ");
					System.out.println(service.searchGradeByName(scanner.next()));					
					break; 
				case 4: // 4.전체성적					
					service.printList();
					break; 
				case 5: // 5.성적순
					service.GradeTotalDsc();
					break; 
				case 6: // 6.이름순 
					service.NameAsc();
					break; 
				default: System.out.println("에러 발생"); break;}
				
			} else {
				System.out.println("시스템 종료!!");
				break;}
		}
		
	/*========================= 무한루프 엔진 =========================*/	
	/* 객체 + 스캐너 + 변수
	   while(true) {
	   	  if(input ! = 0) {
	   	  } else {
	   	  }
	   }
	 */
	}
	/*==================== ??? ====================*/
		// 메인메소드 밖에 있어야 함
	private static int inputCheck(int input, int i, int j) {
		if (input < i || input > j) {
			System.out.println("선택메뉴에서 범위값 외의 수를 입력했습니다.");
			return 0;}
				// 시스템 종료. 리턴타입의 디폴트 값을 리턴했기 때문.
		else {
			return input;}		
	}
}
