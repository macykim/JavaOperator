package abstraction;
/*
 * @ Date: 2015.07.21
 * @ Author: 김청명
 * @ Story: 
*/

public class Orange implements FruitsInterface{
/*======================================필드======================================*/
		
/*=====================================생성자=====================================*/
				
/*===================================멤버메소드===================================*/
		@Override
		public void display(String str) {
			System.out.println(str + "오렌지입니다.");			
		}

		public int count() {
			// int 리턴 타입
			// 리턴 타입이 void가 아니라면, 반드시 return 키워드를 사용해야 한다.
			/* 리턴 타입이 존재할 때 코딩하는 방법:
			   1) 리턴 타입의 지변을 초기화 한다. 지변이니까 메소드 내부에 해야 함.
			      int니까 int를 복붙하고, count도 가져온다.
			   2) return 키워드 뒤에 지변을 둔다.   
			 */
			
			int count = 100; // <= 1)
			return count;  // <= 2)
		}
		
		
}
