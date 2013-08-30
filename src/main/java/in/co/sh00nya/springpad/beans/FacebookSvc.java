package in.co.sh00nya.springpad.beans;

import java.util.Date;
import java.util.List;

public class FacebookSvc implements IFacebookSvc {

	@Override
	public void login(String username, String password) {
		System.out.println("Logging in with " + username + " Pass = " + password); 
	}

	@Override
	public void logout(String username) {
		System.out.println("Logging out " + username);
	}

	@Override
	public List<String> getPostsOn(Date postDate) {
		return null;
	}

}
