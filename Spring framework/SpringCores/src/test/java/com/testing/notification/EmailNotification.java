package com.testing.notification;

public class EmailNotification implements Notification{

	@Override
	public void sendNotification(String massage) {
		System.out.println("Sanding email: " + massage);
	}
	
}
