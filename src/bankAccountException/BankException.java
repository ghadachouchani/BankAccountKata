package bankAccountException;

public class BankException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BankException() {
    }

    public BankException(String msg) {
        super(msg);
    }
}
