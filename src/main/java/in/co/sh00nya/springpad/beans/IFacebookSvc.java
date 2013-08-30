package in.co.sh00nya.springpad.beans;

import java.util.Date;
import java.util.List;

public interface IFacebookSvc {
	
	public void login(String username, String password);
	
	public void logout(String username);
	
	public List<String> getPostsOn(Date postDate);

}
