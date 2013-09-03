package in.co.sh00nya.springpad;

import in.co.sh00nya.springpad.beans.AppManager;
import in.co.sh00nya.springpad.cfg.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

	public static void main(String[] args) {
		String username = "siddharth";
		String password = "pappuPass1234";
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		AppManager appManager = ctx.getBean("appManager", AppManager.class);
		appManager.startOperation(username, password);
	}
	
}
