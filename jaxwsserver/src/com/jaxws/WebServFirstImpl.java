package com.jaxws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.jaxws.WebServFirst")
public class WebServFirstImpl implements WebServFirst {

	@Override
	public void firstMeth() {
		
		System.out.println("hai udhay");

	}

	@Override
	public void secondMeth(String name) {
		System.out.println("hai "+name);
		
	}

	
}
