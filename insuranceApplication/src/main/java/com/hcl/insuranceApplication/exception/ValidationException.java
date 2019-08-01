package com.hcl.insuranceApplication.exception;

public class ValidationException extends ApplicationException {
	private static final long serialVersionUID = 1L;

	public ValidationException(String message) {
		super(message);
	}

	public ValidationException(Throwable cause) {
		super(cause);
	}

	public ValidationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ValidationException(String errorCode, String errorText) {
		super(errorCode, errorText);
	}

	public ValidationException(String errorCode, String errorText, String comments) {
		super(errorCode, errorText, comments);
	}

	public ValidationException(String errorCode, String errorText, String comments, Throwable cause) {
		super(errorCode, errorText, comments, cause);
	}

	public ValidationException(String errorCode, String errorText, String comments, String message, Throwable cause) {
		super(errorCode, errorText, comments, message, cause);
	}
}
