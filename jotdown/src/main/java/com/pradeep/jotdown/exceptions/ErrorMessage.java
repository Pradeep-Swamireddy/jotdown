package com.pradeep.jotdown.exceptions;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
private HttpStatus errorNo;
private String errorMessage;
public HttpStatus getErrorNo() {
	return errorNo;
}
public void setErrorNo(HttpStatus badRequest) {
	this.errorNo = badRequest;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String string) {
	this.errorMessage = string;
}


}
