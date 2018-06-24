package com.pradeep.jotdown.exceptions;

public class NotesEmptyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NotesEmptyException(String exception) {
		super(exception);
	}
}
