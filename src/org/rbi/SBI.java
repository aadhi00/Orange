package org.rbi;

public class SBI extends RBI {
	public void sbiAd() {
		System.out.println("SBI");
		System.out.println("The customer name is aadhi");
		System.out.println("The account no. is 234237867");
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.aadharDetails();
		s.pandetails();
		s.sbiAd();
	}
}
