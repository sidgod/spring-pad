package in.co.sh00nya.springpad;

import in.co.sh00nya.springpad.beans.AppManager;
import in.co.sh00nya.springpad.beans.UserCredentials;
import in.co.sh00nya.springpad.beans.UserCredentialsValidator;
import in.co.sh00nya.springpad.cfg.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

public class Runner {

	public static void main(String[] args) {
		// Spring context stuff
		String username = "siddharth";
		String password = "pappuPass1234";
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		AppManager appManager = ctx.getBean("appManager", AppManager.class);
		appManager.startOperation(username, password);
		
		// Validation stuff
		UserCredentials credentials = new UserCredentials();
		credentials.setUsername("sidgod");
		credentials.setPassword("");
		DataBinder binder = new DataBinder(credentials);
		binder.addValidators(new UserCredentialsValidator());
		binder.validate();
		BindingResult result = binder.getBindingResult();
		System.out.println(result);
	}
	
}
