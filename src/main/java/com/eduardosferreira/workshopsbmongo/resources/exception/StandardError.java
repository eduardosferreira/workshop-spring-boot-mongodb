package com.eduardosferreira.workshopsbmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long    timeStamp;
	private Integer status;
	private String  error;
	private String  message;
	private String  path;
	
	private StandardError() {
		super();
	}
	public StandardError(Long timeStamp, Integer status, String error, String message, String path) {
		this();
		this.setTimeStamp(timeStamp);
		this.setStatus(status);
		this.setError(error);
		this.setMessage(message);
		this.setPath(path);
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	private void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	public Integer getStatus() {
		return status;
	}
	private void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}
	private void setError(String error) {
		this.error = error;
	}
	
	public String getMessage() {
		return message;
	}
	private void setMessage(String message) {
		this.message = message;
	}
	
	public String getPath() {
		return path;
	}
	private void setPath(String path) {
		this.path = path;
	}
	
	

}
