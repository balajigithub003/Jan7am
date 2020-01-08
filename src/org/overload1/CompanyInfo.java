package org.overload1;
//Description
//You have to overload the method companyName() based on different Number of arguments.

public class CompanyInfo {


//method implement
	public void companyName(int comId, String comName) {
		System.out.println("The company details are "+ comId+comName);
	}
	public void companyName(int comId,String comName,float comNetwort) {
		System.out.println("The company details are"+comId+comName+comNetwort);
		
	}
	public void companyName(int comId,String comName,float comNetwort,char comRank ) {
		System.out.println("The company details are "+comId+comName+comNetwort+comRank);
		
	}
	public static void main(String[] args) {
		CompanyInfo com = new CompanyInfo();
		com.companyName(3377, "Hexaware");
		com.companyName(3377, "Hexaware",35.000f );
		com.companyName(3377, "Hexaware", 35.000f, 'A');
	}
	
}
