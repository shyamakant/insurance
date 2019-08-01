package com.hcl.insuranceApplication.exception;

public class ApplicationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errorText;
	private String comments;

	public ApplicationException(String message) {
		super(message);
	}

	public ApplicationException(Throwable cause) {
		super(cause);
	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ApplicationException(String errorCode, String errorText) {
		this(errorText);
		this.errorCode = errorCode;
		this.errorText = errorText;
	}

	public ApplicationException(String errorCode, String errorText, String comments) {
		this(errorText);
		this.errorCode = errorCode;
		this.errorText = errorText;
		this.comments = comments;
	}

	public ApplicationException(String errorCode, String errorText, String comments, Throwable cause) {
		this(errorText, cause);
		this.errorCode = errorCode;
		this.errorText = errorText;
		this.comments = comments;
	}

	public ApplicationException(String errorCode, String errorText, String comments, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
		this.errorText = errorText;
		this.comments = comments;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorText() {
		return this.errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
