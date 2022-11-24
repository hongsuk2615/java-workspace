package com.kh.chap01_beforeVsafter.after.model.vo;

public class SmartPhone extends Product {
	private String mobileAgency;

	public SmartPhone() {
		super();
	}

	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}

	public void setMobileAgent(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgent() {
		return mobileAgency;
	}

	public String information() {
		return super.information() + ", mobileAgency : " + mobileAgency;
	}
}
