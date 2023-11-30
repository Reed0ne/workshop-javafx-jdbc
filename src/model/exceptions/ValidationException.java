package model.exceptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ValidationException extends IOException {

	private static final long serialVersionUID = 1L;
	
	public Map<String, String> errors = new HashMap<>();
	
	public ValidationException(String msg) {
		super(msg);
	}

	public Map<String, String> getErrors() {
		return errors;
	}

	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
	
}
