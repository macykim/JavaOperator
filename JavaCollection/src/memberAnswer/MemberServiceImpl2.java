package memberAnswer;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl2 implements MemberService2{
	/* 
	 * Map<String, Member2> map = new HashMap<String, Member2>();
	 * 위처럼 하는 것이 정석입니다. JSP, DB를 만지게 되면 <String, Object>가 정석입니다.
	 * 하지만 이 예제에서는 <String, String>으로 합니다. 이유는 쉽게 가기 위해서 입니다.
	 */
	
	Map<String,String> map = new HashMap<String, String>();
	Member2 member = new Member2();
	String userid, password, name, address;
	int age;	
	
	@Override
	public void join(String userid, String password, String name, int age, String address){
		member.setUserid(userid);
		member.setPassword(password);
		member.setName(name);
		member.setAddress(address);
		member.setAge(age);
		
		map.put("userid", member.getUserid());
		map.put("password", member.getPassword());
		map.put("name", member.getName());
		map.put("address", member.getAddress());
		map.put("age", String.valueOf(member.getAge()));
			// int 타입을 String 타입으로 바꾸는 법... => String.valueOf()		
	}
	
	@Override
	public String login(String userid, String password){
		String msg = "";
		if (map.get("userid").equals(userid)&&map.get("password").equals(password)) {
			// 두 조건을 모두 충족..
			msg = "환영합니다. " + member.getAddress() + "에 사시는 " + member.getAge() + "세 되시는 " + member.getName() + " 고객님.";
			
		} else if(map.get("userid").equals(userid)&&!map.get("password").equals(password)){
			// 아이디는 맞으나 비밀번호가 틀린 경우..
			msg = "비밀번호가 틀렸습니다. 다시 입력해 주세요.";
		} else if(!map.get("userid").equals(userid)&&map.get("password").equals(password)){
			msg = "입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요.";
		} else {
			msg = "잘못된 정보입니다. 다시 입력해 주세요.";
		}
		
		
		return msg;
	}
}
