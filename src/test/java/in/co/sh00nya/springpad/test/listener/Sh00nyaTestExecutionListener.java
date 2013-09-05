package in.co.sh00nya.springpad.test.listener;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

public class Sh00nyaTestExecutionListener implements TestExecutionListener {

	@Override
	public void afterTestClass(TestContext arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterTestMethod(TestContext arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeTestClass(TestContext arg0) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeTestMethod(TestContext arg0) throws Exception {
		System.out.println("Calling test " + arg0.getTestMethod().getName());
	}

	@Override
	public void prepareTestInstance(TestContext arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}
