package com.webdev.realstate.users.user.domain.exceptions;

public class InvalidPassword extends RuntimeException {
	public InvalidPassword(String message) {
		super(message);
	}
}
