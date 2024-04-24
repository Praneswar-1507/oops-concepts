package com.oops.hotel;

public class BloodBank {
	String bloodType,donorName,recipientName,bloodGroup;
	int quantity,noOfDays,quantityReceived;
	char donatedbefore;
	public BloodBank()
	{
		
	}
	
	public int getQuantityReceived() {
		return quantityReceived;
	}

	public void setQuantityReceived(int quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public char getDonatedbefore() {
		return donatedbefore;
	}

	public void setDonatedbefore(char donatedbefore) {
		this.donatedbefore = donatedbefore;
	}

	public String getBloodType() {
		return bloodType;
	}
	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public BloodBank(String bloodType, String donorName, String recipientName, String bloodGroup, int quantity,
			int noOfDays, int quantityReceived, char donatedbefore) {
		super();
		this.bloodType = bloodType;
		this.donorName = donorName;
		this.recipientName = recipientName;
		this.bloodGroup = bloodGroup;
		this.quantity = quantity;
		this.noOfDays = noOfDays;
		this.quantityReceived = quantityReceived;
		this.donatedbefore = donatedbefore;
	}

	@Override
	public String toString() {
		return "BloodBank [BloodType=" + bloodType + ", donorName=" + donorName + ", recipientName=" + recipientName
				+ ", bloodGroup=" + bloodGroup + ", quantity=" + quantity + ", noOfDays=" + noOfDays
				+ ", quantityReceived=" + quantityReceived + ", donatedbefore=" + donatedbefore + "]";
	}


	}


	
	



