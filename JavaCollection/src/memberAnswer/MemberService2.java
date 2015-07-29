package memberAnswer;

public interface MemberService2 {
	public void join(String userid, String password, String name, int age, String address);
	
	public String login(String userid, String password);
}
