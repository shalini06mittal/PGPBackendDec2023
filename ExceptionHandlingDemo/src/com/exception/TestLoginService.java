package com.exception;

public class TestLoginService {

	public static void main(String[] args) {
		LoginService service = new LoginService();
		boolean res = service.validateUser("", "");
		System.out.println(res);
		
		service.validateUser1("", "");
		
		String msg = service.validateUser2("", "");
		
		try {
			if(service.validateUser3("", ""))
				System.out.println("redirecting to dashboard..");
		} catch (InvalidCreadentialExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// store the information in a file
			
		} catch (InvalidUserExcpetion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * message: success
		 * description: Loginsuccessfule
		 * 
		 * message: failure
		 * description: Failed due to ...
		 */
	}

}
