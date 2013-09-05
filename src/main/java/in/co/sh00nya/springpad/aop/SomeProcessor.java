package in.co.sh00nya.springpad.aop;

public class SomeProcessor {
	
	public void processSomeCrap() {
		System.out.println("Processing crap ...");
		try {
			Thread.sleep(9 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Processing crap done");
	}

}
