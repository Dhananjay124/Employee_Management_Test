package com.sit;

public class Address {

	private int pincode;
	private String cityName;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityName=" + cityName + "]";
	}

}
