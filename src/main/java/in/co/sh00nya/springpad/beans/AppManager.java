package in.co.sh00nya.springpad.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class AppManager {

	@Autowired
	private IFacebookSvc facebookSvc;

	public IFacebookSvc getFacebookSvc() {
		return facebookSvc;
	}

	public void setFacebookSvc(IFacebookSvc facebookSvc) {
		this.facebookSvc = facebookSvc;
	}
	
	public void startOperation(String username, String password) {
		System.out.println("Starting operation ...");
		facebookSvc.login(username, password);
		facebookSvc.logout(username);
		System.out.println("Done with operation ...");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("AppManager constructed ...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("AppManager destroyed ...");
	}

}
