package in.co.sh00nya.springpad.cfg;

import in.co.sh00nya.springpad.aop.SomeAspect;
import in.co.sh00nya.springpad.aop.SomeProcessor;
import in.co.sh00nya.springpad.beans.AppManager;
import in.co.sh00nya.springpad.beans.FacebookSvc;
import in.co.sh00nya.springpad.beans.IFacebookSvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public AppManager appManager() {
		return new AppManager();
	}
	
	@Bean
	public IFacebookSvc facebookSvc() {
		return new FacebookSvc();
	}
	
	@Bean
	public SomeProcessor someProcessor() {
		return new SomeProcessor();
	}
	
	@Bean
	public SomeAspect someAspect() {
		return new SomeAspect();
	}

}
