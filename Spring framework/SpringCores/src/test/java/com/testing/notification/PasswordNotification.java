package com.testing.notification;

public class PasswordNotification implements Notification{

	@Override
	public void sendNotification(String massage) {
		System.out.println("Sanding password: " + massage);
	}

}
