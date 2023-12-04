package com.exception;

public class LoginService {

	public boolean validateUser(String username, String password) {
		if(username.equals("shalini")) {
			if(password.equals("sh"))
				return true;
			else
				return false;
		}
		return false;
	}
	public void validateUser1(String username, String password) {
		if(username.equals("shalini")) {
			if(password.equals("sh"))
				System.out.println("success");
			else
				System.out.println("Invalid credentails. Did you forget password?");;
		}
		System.out.println("Invalid user");;
	}
	public String validateUser2(String username, String password) {
		if(username.equals("shalini")) {
			if(password.equals("sh"))
				return ("success");
			else
				return ("Invalid credentails. Did you forget password?");
		}
		return ("Invalid user");
	}
	
	public boolean validateUser3(String username, String password) throws InvalidCreadentialExcpetion, InvalidUserExcpetion {
		if(username.equals("shalini")) {
			if(password.equals("sh"))
				return true;
			else
				throw new InvalidCreadentialExcpetion("Invalid credentials");
		}
		throw new InvalidUserExcpetion("Invalid user");
	}
}
