package util.vector;
/*
 * @ Date: 2015.07.27
 * @ Author: 김청명
 * @ Story: 
 프로그램을 코딩하다 보면 자료구조를 다루는 데 있어서
 * CRUD 액션의 반복을 경험하게 됩니다.
 * C: Create: 입력, 생산
 * R: Read:   출력, 조회
 * U: Update: 수정 -> 저장된 값을 수정 DB
 * D: Delete: 삭제 -> DB에서의 완전삭제  & null 값으로 바꾸는 삭제 * 
 */

import java.util.Vector;

public class GradeServiceImpl implements GradeService{	
	// 필드에 아래 메소드들이 공유할 자료구조를 무엇을 쓸까 고민
	// 1. ArrayList 2. Vector 3. Stack 4. HashMap ====> 3대 인터페이스를 구현한 4대 클래스
	// 순서 O, 중복 O, 

	private Vector<Grade> vec = new Vector<Grade>();
	Grade grade = new Grade(); // 디폴트 생성자가 있어서 에러 제거
	
	@Override
	public void input(Grade grade) {
		// 성적표 입력		
		// 만약 자료구조로 배열을 사용했다면 vec[0] = hong;
		vec.add(grade);
		}

	@Override
	public void printList() {
		// 전체 출력
		System.out.println(vec.toString());
		}

	@Override
	public String searchGradeByHakbun(String hakbun) {
		// msg = grade.toString(); 을 
		// 학번으로 검색
		String msg = "";
		Grade grade = null; // 주의!! 지변으로 인스턴스를 선언했으므로 초기화 해야 한다.
		for (int i = 0; i < vec.size(); i++) {
			// List 계열의 클래스 길이는 size()로 구한다.
			String searchHakbun = vec.elementAt(i).getHakbun();
			String name = vec.elementAt(i).getName();
				// 만약 vec가 배열이라면 = vec.get(i) <- 이렇게 처리되었을 것
				// 객체.메소드.메소드.메소드.메소드 <- 이런 패턴은
				// 반드시 return 값이 있는 메소드들 끼리 연결시에만 가능하다.
				// 이런 방식을 메소드 체인이라고 한다.
			if (hakbun.equalsIgnoreCase(searchHakbun)) {
				int kor = vec.elementAt(i).getKor();
				int eng = vec.elementAt(i).getEng();
				int math = vec.elementAt(i).getMath();		
				grade = new Grade(searchHakbun, name, kor, eng, math);
				msg = grade.toString();
				break; // 중간이라도 일치하는 학번을 찾을 경우 for loop을 중지하도록 하게 한다.
			}
			else {
				msg = "조회하신 학번이 없습니다.";
			};
			
		}
		return msg;}

	@Override
	public void GradeTotalAsc() {
		// 성적 정렬
		}

}
