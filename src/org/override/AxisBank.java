package org.override;

public class AxisBank {
	public void deposit() {
		System.out.println("deposit interest was high");
	}
	public static void main(String[] args) {
		AxisBank axis = new AxisBank();
		axis.deposit();
	}

}
