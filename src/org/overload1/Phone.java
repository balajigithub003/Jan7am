package org.overload1;
//Class       :Phone
//Methods     :phoneInfo()

//Description
//You have to overload the method phoneInfo() based on different datatype order in arguments

public class Phone {
	public void phoneInfo(int phImei,String Name) {
		System.out.println("The details are"+phImei+Name);
		
	}
	public void phoneInfo(String Name, int phImei,float phPrice) {
		System.out.println("The details are"+Name+phImei+phPrice);
	}
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo(33778773, "iphone");
		ph.phoneInfo("iphone", 33778773, 50.000f);
			
		
	}

}
