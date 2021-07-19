package in.chainsys.exception;

public class ServiceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7871998208129097840L;

	/**
	 * exception to be thrown in service class
	 * 
	 * @param message the message to be thrown
	 */

	public ServiceException(String message) {
		super(message);
	}

	/**
	 * exception to be thrown in service class with mentioning the type
	 * 
	 * @param e       cached exception type
	 * @param message the message to be thrown
	 */

	public ServiceException(Throwable e, String message) {
		super(message, e);
	}

}