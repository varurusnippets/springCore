package com.example1;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int id;

	private String addressLine;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

}
