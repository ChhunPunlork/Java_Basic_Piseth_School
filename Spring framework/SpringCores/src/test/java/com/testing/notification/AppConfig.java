package com.testing.notification;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Notification notification() {
		return new EmailNotification();
	}
	@Bean
	public UserService userService() {
		return new UserService(notification());
	}
}
