package model.exceptions;

public class DomainException extends RuntimeException{

	private static final long serialVersionUID = 1L;	
	
	//constructor
	public DomainException(String msg) {
		super(msg);
	}
}
//End of class