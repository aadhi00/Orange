package org.rbi;

public class ICICI extends RBI {
	public void iciciAd() {
		System.out.println("SBI");
		System.out.println("The Customer Name is aadhi");
		System.out.println("The Account No. is 345667");
	}
	public static void main(String[] args) {
		ICICI i=new ICICI();
		i.aadharDetails();
		i.pandetails();
		i.iciciAd();
	}
}
