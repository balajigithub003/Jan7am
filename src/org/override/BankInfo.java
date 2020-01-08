package org.override;
//Class     :BankInfo
//Methods   :saving(),fixed(),deposit()

//Class     :AxisBank
//Methods   :deposit()

public class BankInfo extends AxisBank {
	public void savings() {
		System.out.println("savings amount was 5lacks");
	}
	public void fixed() {
		System.out.println("fixed deposit was 10lacks");
	}
	public void deposit() {
		System.out.println("deposit is available");
	}
public static void main(String[] args) {
	BankInfo bank = new BankInfo();
	bank.savings();
	bank.fixed();
	bank.deposit();
	
}
}
