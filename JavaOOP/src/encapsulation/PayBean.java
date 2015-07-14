package encapsulation;
/*
 * @ Date: 2015.07.14
 * @ Author: Me
 * @ Story: 월급계산기
 */

public class PayBean {
	// 메소드는 선언부, 연산부, 출력부 이렇게 나누고
	// Bean 클랙스라면 멤버필드 영역과 멤버메소드 영역으로 나눈다.
	
	private String name; // 멤버필드 변수는 초기화를 하지 않는다***
	private int salary, tax, wage;
	
	// 멤버메소드 영역 시작
		// 스캐너로 받는 것은 무조건 setter
			public void setName(String name) {
				this.name = name;}
			public void setSalary(int salary) {
				this.salary = salary;}
			public void setTax(int tax) {
				this.tax = tax;}
			
			// this는 이 클래스 내부에 있는 ~~~의 의미
			
		// 계산을 통해서 출력하는 것은 무조건 getter
			/* 선생님 답
			 * public int getTax() {
				int tax = 0; // 지변 초기화
				tax = (int) (salary * 0.1);
				return tax;}
			 */
			public int getWage() {
				int wage = 0; // 지변 초기화
				wage = salary - (salary * tax / 100);
				// 선생님 답: wage = salary - getTax();
				return wage;}
		
		// toString 무조건 시작 - 이걸 던져줘야 sysout을 시작
			@Override
			public String toString() {
		
				return ("[" + this.name + " 실급여]\n"
						+ "월급: " + this.salary + "만원\n"
						+ "세금: " + this.tax + "만원\n"
		  // 선생님 답: + "세금: " + this.getTax() + "만원\n"
						+ "실급여: " + this.getWage() + "만원\n");}
		
		
		
}
