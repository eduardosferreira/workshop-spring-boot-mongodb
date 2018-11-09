package com.eduardosferreira.workshopsbmongo.exception;

public class DomainException extends Exception {

	private static final long serialVersionUID = 1L;

	public DomainException() {
		super();
	}

	public DomainException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DomainException(String message, Throwable cause) {
		super(message, cause);
	}

	public DomainException(String message) {
		super(message);
	}

	public DomainException(Throwable cause) {
		super(cause);
	}

}
