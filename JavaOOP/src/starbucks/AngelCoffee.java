package starbucks;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story: StarbucksCoffee를 발전시킨 버전
*/

public class AngelCoffee extends DrinkRecipe{
	private String coffee;
	
	@Override
	void brew() {
		System.out.println("커피를 내린다.");
	}

	@Override
	void select(int option) {				
			if (option == 1) {this.coffee = "블랙";}			
			else if (option == 2) {this.coffee = "밀크";}
			else {this.coffee = "선택오류";}	
	}

	@Override
	void serve() {
		System.out.println("고객님 [" + this.coffee + "] 커피가 나왔습니다. \n");
	}

}
