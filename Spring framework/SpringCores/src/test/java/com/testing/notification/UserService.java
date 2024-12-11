package com.testing.notification;

public class UserService {
	
	private Notification notification;
	
	public UserService(Notification notification) {
		this.notification = notification;
	}
	
	public void register(String userName) {
		System.out.println("Username: " + userName + "register successfully");
		notification.sendNotification("Welcome, " + userName + "!");
	}
}
