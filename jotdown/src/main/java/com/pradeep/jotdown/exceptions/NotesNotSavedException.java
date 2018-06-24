package com.pradeep.jotdown.exceptions;

public class NotesNotSavedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotesNotSavedException(String exception){
		super(exception);
	}
}
