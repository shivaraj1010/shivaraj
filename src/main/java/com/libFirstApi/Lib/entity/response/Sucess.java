package com.libFirstApi.Lib.entity.response;

public class Sucess {

	private Long Status;
	private String Message;
	private String data;
	
	public Sucess() {
		
	}
	public Sucess(Long status, String message, String data) {
		super();
		Status = status;
		Message = message;
		this.data = data;
	}
	public Long getStatus() {
		return Status;
	}
	public void setStatus(Long status) {
		Status = status;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
}
