package in.co.sh00nya.springpad.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SomeAspect {
	
	@Pointcut("execution(* in.co.sh00nya.springpad.aop.SomeProcessor.*(..))")
	public void someProcessorAspect() { }

	@Around("in.co.sh00nya.springpad.aop.SomeAspect.someProcessorAspect()")
	public void doConcurrentOperation(ProceedingJoinPoint pjp)
			throws Throwable {
		long startTime = System.currentTimeMillis();
		pjp.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Total time = " + (endTime - startTime));
	}
}
