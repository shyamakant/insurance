package com.hcl.insuranceApplication.exception;

public class BusinessException extends ApplicationException {
	private static final long serialVersionUID = 1L;

	public BusinessException(String errorCode, String errorText, String comments, String message, Throwable cause) {
		super(errorCode, errorText, comments, message, cause);
	}

	public BusinessException(String errorCode, String errorText, String comments, Throwable cause) {
		super(errorCode, errorText, comments, cause);
	}

	public BusinessException(String errorCode, String errorText, String comments) {
		super(errorCode, errorText, comments);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}

	public BusinessException(String errorCode, String errorText) {
		super(errorCode, errorText);
	}
}
