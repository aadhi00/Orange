package org.rbi;

public class HDFC extends RBI {
	public void hdfcAd() {
		System.out.println("HDFC");
		System.out.println("The customer name is aadhi");
		System.out.println("The account no. is 458956769");
	}
	public static void main(String[] args) {
		HDFC h = new HDFC();
		h.aadharDetails();
		h.pandetails();
		h.hdfcAd();
	}
}
