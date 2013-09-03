package in.co.sh00nya.springpad.beans;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserCredentialsValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return UserCredentials.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "error.field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "error.field.required");
	}

}
