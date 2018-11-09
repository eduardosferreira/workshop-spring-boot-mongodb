package com.eduardosferreira.workshopsbmongo.resources.exception;

public class StandardErrorException extends Exception {

	private static final long serialVersionUID = 1L;

	public StandardErrorException() {
		super();
	}

	public StandardErrorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StandardErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public StandardErrorException(String message) {
		super(message);
	}

	public StandardErrorException(Throwable cause) {
		super(cause);
	}

}
