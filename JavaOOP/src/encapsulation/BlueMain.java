package encapsulation;
/*
 * @ Date: 2015.07.16
 * @ Author: 김청명
 * @ Story: Tester for Monopoly Class
 */

// How it works? : Dice에서 주사위를 굴리고 BlueMain으로 가져오고 Blue로 보내서 더하고 다시 BlueMain으로 가져옴

public class BlueMain {
	public static void main(String[] args) {
		// 클래스이름 객체이름 = new 생성자(); ==> 인스턴스 생성 공식
		Dice dice1  = new Dice();
		Dice dice2 = new Dice();
		Blue blue = new Blue(dice1, dice2);
		
		System.out.println(blue.toString());
		}
				
	}

