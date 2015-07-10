package controller;

import java.util.Scanner;

import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;

/*
 * @ Date: 2015.07.09
 * @ Author: Me
 * @ Story: Dashboard의 개념으로 코딩한것들 테스트 해보는 곳?? 
 */

public class OperatorController {
	public static void main(String[] args) {
		
		// 1) 20150709 성적 계산기
		CalcAvg avg = new CalcAvg();
		avg.calcAvg();
		
		// 2) 20150709 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
		calc.calc();
				
		// 3) 20150710 switch-case 이름/국어/영어/수학 성적표
		SwitchAvg avg2 = new SwitchAvg();
		avg2.calc();
		
		// 4) 20150710 주민번호로 성별 및 내국인/외국인 판별
		ManOrWoman sex = new ManOrWoman();
		sex.ssn(); // ssn() -> 이 파트는 원 클래스의 public void 메소드 이름 
		
		
	}
}