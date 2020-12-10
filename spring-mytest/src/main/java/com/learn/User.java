package com.learn;

/**
 * @author 麦易
 * date: 2020/12/10 6:35 下午
 * desc:
 **/
public class User {
	private String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				'}';
	}
}
