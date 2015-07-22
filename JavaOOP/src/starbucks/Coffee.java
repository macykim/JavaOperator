package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: coffee-making 예제를 통한 추상클래스 학습
*/

import java.util.Scanner;

import abstraction.Robot;

public class Coffee implements Recipe{
	private String coffee;	
	
	@Override
	public void boilWater() {
		System.out.println("물을 끓인다.");}

	@Override
	public void brew() {
		System.out.println("커피를 내린다.");}

	@Override
	public void pourInCup() {
		System.out.println("물을 컵에 붓는다.");}
		
	
	@Override
	public void select(int option) {		
		if (option == 1) {this.coffee = "블랙";}			
		else if (option == 2) {this.coffee = "밀크";}
		else {this.coffee = "선택오류";}	
	 /* OR
	    switch (option) {
	    case 1: this.coffee = "블랙"; break;
	    case 2: this.coffee = "밀크"; break;
	  */
	}

	@Override
	public void serve() {
		System.out.println("고객님 [" + this.coffee + "] 커피가 나왔습니다. \n");}
	
}

