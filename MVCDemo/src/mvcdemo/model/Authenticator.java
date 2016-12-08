package mvcdemo.model;

public class Authenticator {
	public String authenticate(String username,String password) {
		//String = "prem";
		if (("prem".equalsIgnoreCase(username))&& ("prem".equals(password))) {
			return "success";
		} else {
			return "failure";
		}		
	}
}
