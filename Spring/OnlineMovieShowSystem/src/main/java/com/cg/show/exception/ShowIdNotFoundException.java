package com.cg.show.exception;

public class ShowIdNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ShowIdNotFoundException(String msg) {
		super(msg);
	}
	public ShowIdNotFoundException(String msg,Throwable S) {
		super(msg,S);
	}

}
