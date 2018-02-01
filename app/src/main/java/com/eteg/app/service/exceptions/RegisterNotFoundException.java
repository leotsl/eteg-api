package com.eteg.app.service.exceptions;

/**
 * 
 * @author Leonardo Lima
 *
 */

public class RegisterNotFoundException extends RuntimeException {    

	private static final long serialVersionUID = 1L;

	public RegisterNotFoundException() {
        super();
    }

    public RegisterNotFoundException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public RegisterNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public RegisterNotFoundException(String message) {
        super(message);
    }

    public RegisterNotFoundException(Throwable cause) {
        super(cause);
    }
}
