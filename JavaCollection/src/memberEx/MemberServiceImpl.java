package memberEx;

import java.util.Vector;

/*
 * @ Date: 2015.07.29
 * @ Author: 김청명
 * @ Story: 
 */

public class MemberServiceImpl implements MemberService{

	private Vector<Member> vec = new Vector<Member>();
	Member member = new Member();
	
	@Override
	public void join(String userid, String password, String name, int age, String address) {//Member member) {
		vec.add(member);
	}

	@Override
	public void login(String userid, String password) {
		System.out.println(vec.toString());
	}

}
