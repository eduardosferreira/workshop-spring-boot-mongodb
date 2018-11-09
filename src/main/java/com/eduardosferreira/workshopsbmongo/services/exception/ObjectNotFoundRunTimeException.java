package com.eduardosferreira.workshopsbmongo.services.exception;

public class ObjectNotFoundRunTimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundRunTimeException() {
		super();
	}

	public ObjectNotFoundRunTimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ObjectNotFoundRunTimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundRunTimeException(String message) {
		super(message);
	}

	public ObjectNotFoundRunTimeException(Throwable cause) {
		super(cause);
	}

}
