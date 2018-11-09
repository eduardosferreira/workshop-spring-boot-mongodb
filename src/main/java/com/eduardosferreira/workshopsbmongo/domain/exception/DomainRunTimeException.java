package com.eduardosferreira.workshopsbmongo.domain.exception;

public class DomainRunTimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainRunTimeException() {
		super();
	}

	public DomainRunTimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public DomainRunTimeException(String message, Throwable cause) {
		super(message, cause);
	}

	public DomainRunTimeException(String message) {
		super(message);
	}

	public DomainRunTimeException(Throwable cause) {
		super(cause);
	}

}
