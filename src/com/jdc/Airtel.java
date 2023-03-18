package com.jdc;

public class Airtel implements Sim{

	public Airtel() {
		System.out.println("Constructor of Airtel");
	}
	@Override
	public void calling() {
		System.out.println("Calling through Airtel");

		
	}

	@Override
	public void data() {
		System.out.println("Browsing through Airtel");

		
	}

}
