package com.ajay.qrcode_generator.model;

public class PaytmDetails {

	private String userName;
	private long mobileNumber;
	private String accountType;
	private String accountNumber;

	public PaytmDetails(String userName, long mobileNumber, String accountType, String accountNumber) {
		super();
		this.userName = userName;
		this.mobileNumber = mobileNumber;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
	}

	public PaytmDetails() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "PaytmDetails [userName=" + userName + ", mobileNumber=" + mobileNumber + ", accountType=" + accountType
				+ ", accountNumber=" + accountNumber + "]";
	}

}
