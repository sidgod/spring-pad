package in.co.sh00nya.springpad.test.cfg;

import in.co.sh00nya.springpad.beans.AppManager;
import in.co.sh00nya.springpad.beans.IFacebookSvc;
import in.co.sh00nya.springpad.cfg.AppConfig;
import in.co.sh00nya.springpad.test.listener.Sh00nyaTestExecutionListener;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@TestExecutionListeners(listeners = {Sh00nyaTestExecutionListener.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration (classes = {AppConfig.class})
public class TestSuite {
	
	@Autowired
	private IFacebookSvc facebookSvc;
	
	@Autowired
	private ApplicationContext ctx;

	@Repeat(3)
	@Test
	public void nullTest() {
		System.out.println(facebookSvc == null);
		System.out.println(ctx == null);
	}

}
