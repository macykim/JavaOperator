package encapsulation;
/*
 * @ Date: 2015.07.15
 * @ Author: 김청명
 * @ Story: 버전업--현재는 홍길동 승! 이라고 출력되는데, 개선을 하려고 함.
  			출력결과: 
   			[player1 name: number] vs [player2 name: number]
		    player win!
 */
public class CardGame {	
/* ======================================== Field ========================================*/
	private String winner, loser;// 멤변 선언
	private int win, lose;

/* ===================================== Constructor =====================================*/
	// 생성자 단축키: CTRL + space
	// parameter 없이 한개만 만들어도 됨
	// parameter를 넣으면 setter 역할도 함
	public CardGame() {} // 디폴트 생성자
		// getter에서 문재해결 패턴
		// 제일 먼저 리턴타입을 카피
	
	public CardGame(CardBean3 game1, CardBean3 game2) {

		 String winner = "", loser = "";
		 int win = 0, lose = 0;
		 
		 // 지역변수 (a.k.a 로컬변수, 지변)는 메모리영역 중에서 (콜)스택에 저장
		 // 인스턴스변수 (a.k.a 멤버변수, 멤변)는 메모리영역 중에서 힙에 저장

		 if (game1.getNum() > game2.getNum())
		 	{winner = game1.getName();
		 	 loser = game2.getName();
		 	 win = game1.getNum();
		 	 lose = game2.getNum();}
		 
		 else if (game2.getNum() > game1.getNum())
			 {winner = game2.getName();
		 	  loser = game1.getName();
		 	  win = game2.getNum();
		 	  lose = game1.getNum();}			 
		 else {System.out.println("동점!");}		
		 this.winner = winner;
		 this.loser = loser;
		 this.lose = lose;
		 this.win = win;
		 }

/* ===================================== Method =====================================*/
	// Method 영역.. 하나 이상일 경우 Member Method라고 부름
	@Override
	public String toString() {	
		return "[" + this.winner + ": " + this.win + "]"
				+ " vs. [" + this.loser + ": " + this.lose + "]"
				+ "\n" + this.winner;}
		
}

