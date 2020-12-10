package com.learn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 麦易
 * date: 2020/12/10 6:36 下午
 * desc:
 **/
@Configuration
@ComponentScan
public class JavaConfig {
	@Bean
	public User user() {
		return new User("麦易");
	}
}
