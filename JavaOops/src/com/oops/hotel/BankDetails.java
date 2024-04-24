package com.oops.hotel;

public class BankDetails {
		long accountNo, phoneNumber;
		int deposit;
		String userName, IFSC;
		public BankDetails()
		{
			
		}
		
		public long getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(long accountNo) {
			this.accountNo = accountNo;
		}
		public long getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(long phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public int getDeposit() {
			return deposit;
		}
		public void setDeposit(int deposit) {
			this.deposit = deposit;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getIFSC() {
			return IFSC;
		}
		public void setIFSC(String iFSC) {
			IFSC = iFSC;
		}
		public BankDetails(long accountNo, long phoneNumber, int deposit, String userName, String iFSC) {
			this.accountNo = accountNo;
			this.phoneNumber = phoneNumber;
			this.deposit = deposit;
			this.userName = userName;
			IFSC = iFSC;
		}

		@Override
		public String toString() {
			return "BankDetails [accountNo=" + accountNo + ", phoneNumber=" + phoneNumber + ", deposit=" + deposit
					+ ", userName=" + userName + ", IFSC=" + IFSC + "]";
		}
		
		
		
		}

