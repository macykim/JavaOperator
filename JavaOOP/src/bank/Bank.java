package bank;
/*
 * @ Date: 2015.07.22
 * @ Author: 김청명
 * @ Story:
 */

public class Bank implements BankRole{	
// ========================== 필드 ==========================		
	private BankBook[] bankBookList;
		// 은행은 여러개의 통장을 관리한다. 따라서, 필드에 인스턴스변수
		// 하나를 지정하지 않고 여러개를 담을 수 있는 배열을 지정한다.
		// 은행에서 보면 계좌를 관리하는 DB라고 칠 수 있다.
	private int count;
		// 은행에서 관리하는 통장 갯수
// ========================= 생성자 =========================
	public Bank(int count) {
		bankBookList = new BankBook[count];
			// 배열, 자료구조(컬렉션)을 보유하는 객체를 만들고자 할 때에는
			// 그 객체의 생성자에 배열, 자료구조의 객체를 생성해준다.
	}
			
// ======================= 멤버메소드 =======================
	/*===getter/setter===*/
	public BankBook[] getBankBookList() {
		return bankBookList;}

	public int getCount() {
		return count;}

	public void setBankBookList(BankBook[] bankBookList) {
		this.bankBookList = bankBookList;}

	public void setCount(int count) {
		this.count = count;}

	// 계좌개설
	@Override
	public void openAccount(String ownerName,
			int password, int restMoney) {	
	BankBook bankBook = new BankBook(ownerName);
	bankBook.setPass(password);
	bankBook.deposit(restMoney);
	// 통장을 개설하자마자 은행전산 DB에 통장정보 저장 개념
	bankBookList[count] = (BankBook) bankBook;
	this.count++; // 전체 은행에 개설된 통장 갯수 1 증가
	System.out.println(bankBook.showAccount());
	}
	
	
	// 계좌검색 (계좌번호 사용) -> 리턴결과: 계좌 1개
	@Override
	public BankBook searchAccountByAccountNo(String accountNo) {		
		BankBook account = null;
		// String => int
		int searchAccountNo = Integer.parseInt(accountNo);
		for (int i = 0; i < this.count; i++) {
			if (bankBookList[i].getBankbookNo()==searchAccountNo)
				// 스트링 타입이 서로 같은지의 여부는 .equals(),
				// 숫자 타입이 서로 같은지의 여부는 ==
				{account = bankBookList[i];}
		}
		return account;}

	// 계좌검색 (이름 사용) -> 리턴결과: 계좌 갯수
	@Override
	public BankBook[] searchAccountByName(String ownerName) {		
		BankBook[] accounts = null;
		int tempCount = this.searchCountByName(ownerName);
			// searchAccountByName() 이 메소드를 호출하면, 자동으로
			// 밑에 있는 searchCountByName()을 먼저 호출하라는 의미
		if (tempCount == 0) {
			// 만약 조회하는 사람의 통장이 하나도 없다면,
			return null;}
		for (int i = 0; i < this.count; i++)
			{if(bankBookList[i].getName().equals(ownerName))
				{accounts[tempCount] = bankBookList[i];
				tempCount++;}
		}
		return accounts;}

	// 계좌검색 (이름 사용) -> 리턴결과: 숫자
	@Override
	public int searchCountByName(String name) {	
		// for문을 돌면서 파라미터로 받은 이름과 동일한 통장(계좌)이
		// 있다면, count를 0에서 1씩 증가시켜라
		int count = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (bankBookList[i].getName().equals(name)) {
				count++;}
		}
		return count;}

	// 계좌해지 -> 리턴결과: true or false
	@Override
	public boolean closeAccount(String accountNo) {
		boolean flag = false;
			// flag은 삭제가 성공적으로 이루어지면 true를 리턴하고,
			// 삭제할 것이 없으면 false를 리턴한다.			
		for (int i = 0; i < this.count; i++) {
			int searchAccountNo = Integer.parseInt(accountNo);
				// String으로 들어온 값을 숫자로 바꿔서 비교
			if (bankBookList[i].getBankbookNo()==searchAccountNo)
				{flag = true;
				// j = i 로 바꾼 이유는, 예를 들면, 홍길동의 계좌가가
				// 은행 전체 계좌의 50번째라고 가정했을 때, 내부 for 문에서
				// 다시 처음 0부터 회전하지 않고 홍길동의 계좌가 있는 인덱스
				// 번호부터 뒤에 있는 계좌 번호를 덮어쓰는 방식으로 진행한 후
				// 맨 마지막 인덱스 번호를 제거하면 전체 계좌가 100개가 있는
				// 상황이라면, 홍길동이 삭제된 후, 전체 계좌수는 99개가 될 것이다.
				// 그래서, this.count-1을 해 주었다.
				for (int j = i; j < this.count-1; j++)
				{bankBookList[i] = bankBookList[j+1];}
				count--;}
		}
		return flag;
	}	
}
