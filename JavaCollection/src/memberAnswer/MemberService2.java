package memberAnswer;
/*
 * @ Date: 2015.07.29
 * @ Author: 김청명
 * @ Story:
 */

public interface MemberService2 {
	public void join(String userid, String password, String name, int age, String address);
	
	public String login(String userid, String password);
}
