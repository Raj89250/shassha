package org.company;

public class CompanyInfo {
	
	private void  companyName()
	{
		System.out.println("Greens");
	}
	
	private void  companyId()
	{
		System.out.println("123");
	}
	
	private void  companyAddress()
	{
		System.out.println("Chennai");
	}
	
	
	public static void main(String[] args) {
		
		CompanyInfo ci = new CompanyInfo();
		
		ci.companyId();
		ci.companyName();
		ci.companyAddress();
		
	}

}
