package com.example.demo.dtos;

import java.io.Serializable;

public class SayHelloDto { 
	String message = "";
	
	

	public SayHelloDto() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public SayHelloDto(String message) {
		super();
		this.message = message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
