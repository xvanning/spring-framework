package com.learn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 麦易
 * date: 2020/12/10 6:37 下午
 * desc:
 **/
public class TestBuild {
	public static void main(String[] args) {
		System.out.println("hah");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		User user = (User)context.getBean("user");
		System.out.println(user.toString());

	}
}
