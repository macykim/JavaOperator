package controller;

import ifCondition.ArithmeticCalc;
import ifCondition.CalcAvg;

/*
 * @ Date: 2015.07.09
 * @ Author: Me
 * @ Story: Dashboard의 개념으로 코딩한것들 테스트 해보는 곳?? 
 */

public class OperatorController {
	public static void main(String[] args) {
		// 20150709 성적 계산기
		CalcAvg avg = new CalcAvg();
		avg.calcAvg();
		
		// 20150709 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
	}
	
}
