package util.vector;
/*
 * @ Date: 2015.07.27
 * @ Author: 김청명
 * @ Story: Vector에서 ArrayList로 옮겨가는 과정...
 			elementAt 대신에 get으로 바꿈..........
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

// 전체에서 특정 글자 바꾸기 단축키: CTRL + A + F

public class GradeServiceImpl2 implements GradeService{	
	// 필드에 아래 메소드들이 공유할 자료구조를 무엇을 쓸까 고민
	// 1. ArrayList 2. Vector 3. Stack 4. HashMap ====> 3대 인터페이스를 구현한 4대 클래스
	// 순서 O, 중복 O, 

	private List<Grade> vec = new ArrayList<Grade>();
	Grade grade = new Grade(); // 디폴트 생성자가 있어서 에러 제거
	
	@Override
	public void input(Grade grade) {
		// 성적표 입력		
		// 만약 자료구조로 배열을 사용했다면 vec[0] = hong;
		vec.add(grade);
		}

	/*================================ 전체 출력 =================================*/
	@Override
	public void printList() {		
		System.out.println(vec.toString());
		}

	/*============================== 학번으로 검색 ===============================*/
	@Override
	public String searchGradeByHakbun(String hakbun) {
		String msg = "";
		Grade grade = null; // 주의!! 지변으로 인스턴스를 선언했으므로 초기화 해야 한다.
		for (int i = 0; i < vec.size(); i++) {
			// List 계열의 클래스 길이는 size()로 구한다.
			String searchHakbun = vec.get(i).getHakbun();
			String name = vec.get(i).getName();
				// 만약 vec가 배열이라면 = vec.get(i) <- 이렇게 처리되었을 것
				// 객체.메소드.메소드.메소드.메소드 <- 이런 패턴은
				// 반드시 return 값이 있는 메소드들 끼리 연결시에만 가능하다.
				// 이런 방식을 메소드 체인이라고 한다.
			if (hakbun.equalsIgnoreCase(searchHakbun)) {
				int kor = vec.get(i).getKor();
				int eng = vec.get(i).getEng();
				int math = vec.get(i).getMath();		
				grade = new Grade(searchHakbun, name, kor, eng, math);
				msg = grade.toString();
				break;} // 중간이라도 일치하는 학번을 찾을 경우 for loop을 중지하도록 하게 한다.
			else {msg = "조회하신 학번이 없습니다.";}			
		}
		return msg;}

	/*======================== 성적 정렬.. 큰수부터 작은수 =========================*/
	@Override
	public void GradeTotalDsc() {
		// Java API 중에서 정렬담당 클래스--Comparator
		// 인터페이스를 구현한 익명 내부 클래스--anonymous inner class
	/*==================== 안드로이드에서 쓰이는.... 여기서부터 ====================*/
		Comparator<Grade> desc = new Comparator<Grade>() {
			
			@Override
			public int compare(Grade g1, Grade g2) {
				// 삼항연산자....
				/* if(condition) { --> condition이 true면, statement1 실행..}
				   else { --> false면 statement2 실행}
				  				   
				   (condition) ? 참 : 거짓; --> 삼항연산식--컨디션 1항, 참 2항, 거짓 3항...
				 */
			
			 /*	if (g1.getTotal() < g2.getTotal()) {temp = 1;}
				else {if (g1.getTotal()==g2.getTotal()) {temp = 0;}
					  else {temp = -1;}
				}
				return temp;
				
			 */ // -> 이게 아래와 같은거임
				return (g1.getTotal() < g2.getTotal()) ? 1 : 
					(g1.getTotal() == g2.getTotal()) ? 0 : -1;
			}
		};
		Collections.sort(vec,desc);
		System.out.println(vec.toString());
	}	
	/*===================== 안드로이드에서 쓰이는... 여기까지 ======================*/
	
	/*============================ 이름 정렬.. 가나다순 ============================*/
	public void NameAsc() {		
		Comparator<Grade> asc = new Comparator<Grade>() {
			
			@Override
			public int compare(Grade g1, Grade g2) {
				// 값(value)이 int 타입이 아니고 String 타입일 경우 우선 순위 결정은 compareTo() 라는 메소드를 사용해야 한다.
				return g1.getName().compareTo(g2.getName());					
			}
		};
		Collections.sort(vec, asc);
		System.out.println(vec.toString());
	}
	 		
	
	@Override
	public Vector<Grade> searchGradeByName(String name) {
		Vector<Grade> temp = new Vector<Grade>();
		Grade grade = null;
		
		for (int i = 0; i < vec.size(); i++) {
			String searchName = vec.get(i).getName();
			if (name.equalsIgnoreCase(searchName)) {
				// 고정값(파라미터).equals(변수값)
				grade = new Grade(vec.get(i).getHakbun(), name, vec.get(i).getKor(), vec.get(i).getEng(), vec.get(i).getMath());
					/* = String hakbun = vec.get(i).getHakbun();
					   	 int kor = vec.get(i).getKor();
					   	 int eng = vec.get(i).getEng();
					   	 int math = vec.get(i).getMath(); */
				temp.add(grade);						
			} else {temp.remove(new Grade());}
				// "temp라는 벡터를 완전히 비워서 null로 리턴하겠다"로 보면 된다.			
		}
		return temp;
	}

}
