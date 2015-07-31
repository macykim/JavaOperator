package swing;

import java.util.Arrays;

/*
 * @ Date: 2015.07.30
 * @ Author: 김청명
 * @ Story: 
 */

public class Lotto {
	// 로또는 1부터 45까지 중복되지 않는 랜덤한 숫자들의 집합
	int[] lotto = new int[6];

	public int[] getLotto() {
		return lotto;}

	public void setLotto() {
		// 로또는 외부에서 숫자를 주입받는 것이 아니라 자체적으로 랜덤숫자를 발생시켜야 한다.
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = 0;}
		
		for (int i = 0; i < lotto.length; i++) {
			int randomNum = (int) ((Math.random()*45) + 1);
			// 로또의 법칙: 로또는 숫자가 중복이 있어서는 안된다.
			// 나중에 나온 숫자가 먼저 나온 숫자와 같다면, 그 숫자는 폐기하고
			// 다시 돌아야 한다. 이때, 카운트 숫자는 증가하면 안된다.		
			boolean exist = false;
			for (int j = 0; j < lotto.length; j++) {
				if (randomNum == lotto[j]) {
					exist = true;
					break;}					
			} if (exist) {
					i--;
					continue; }
						else {lotto[i] = randomNum;
					}						
				}	
			// for문 내부에 다시 for문을 주어 (이중for문) 번호의
			// 중복여부를 체크하고, 만약 중복되었다면 회전 카운트
			// (i) 값을 마이너스 처리하여 이번 회전을 무효화 시킨다.
				// this.lotto = lotto;
		Arrays.sort(lotto);
			}
		
			
		
		
		
	}

