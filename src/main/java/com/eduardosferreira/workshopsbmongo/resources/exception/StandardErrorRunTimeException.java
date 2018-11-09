package com.eduardosferreira.workshopsbmongo.resources.exception;

public class StandardErrorRunTimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public StandardErrorRunTimeException() {
		super();
	}

	public StandardErrorRunTimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public StandardErrorRunTimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public StandardErrorRunTimeException(String message) {
		super(message);
	}

	public StandardErrorRunTimeException(Throwable cause) {
		super(cause);
	}

}
