package com.eteg.app.service.exceptions;

/**
 * 
 * @author Leonardo Lima
 *
 */

public class RegisterExistingException extends RuntimeException {    

	private static final long serialVersionUID = 1L;

	public RegisterExistingException() {
        super();
    }

    public RegisterExistingException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RegisterExistingException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterExistingException(String message) {
        super(message);
    }

    public RegisterExistingException(Throwable cause) {
        super(cause);
    }
 
}