package com.cg.show.exception;

public class NoShowFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public NoShowFoundException(String msg) {
		super(msg);
	}
	public  NoShowFoundException(String msg,Throwable S) {
		super(msg,S);
	}

}
