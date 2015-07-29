package memberEx;
/*
 * @ Date: 2015.07.29
 * @ Author: 김청명
 * @ Story: main이 있음... getter/setter가 있음
 */

public class Member {
	private String userid, password, name, address;
	private int age;			

	public Member() {
		
	}

	public String getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAge(int age) {
		this.age = age;
	}



}


