package in.co.sh00nya.springpad;

import in.co.sh00nya.springpad.aop.SomeProcessor;
import in.co.sh00nya.springpad.beans.AppManager;
import in.co.sh00nya.springpad.beans.UserCredentials;
import in.co.sh00nya.springpad.beans.UserCredentialsValidator;
import in.co.sh00nya.springpad.cfg.AppConfig;
import in.co.sh00nya.springpad.spel.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

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
		
		// SPEL stuff
		Employee employee = new Employee(100, "Sid", "BappaMorya", 10000);
		EvaluationContext eContext = new StandardEvaluationContext(employee);
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("salary - 5000");
		Object valObject = expression.getValue(eContext);
		System.out.println(valObject);
		expression = parser.parseExpression("salary");
		expression.setValue(eContext, 20000);
		System.out.println(employee);
		
		// AOP Stuff
		SomeProcessor processor = ctx.getBean("someProcessor", SomeProcessor.class);
		processor.processSomeCrap();
	}
	
}
