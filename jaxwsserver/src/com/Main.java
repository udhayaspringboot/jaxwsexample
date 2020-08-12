package com;

import javax.xml.ws.Endpoint;

import com.jaxws.ProductServImpl;
import com.jaxws.WebServFirstImpl;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("hello");
	try {
			System.out.println("hi");
			Endpoint.publish("http://localhost:8944/com/jaxws/WebServFirst", new WebServFirstImpl());
			Endpoint.publish("http://localhost:8944/com/jaxws/ProductServ", new ProductServImpl());
			System.out.println("started");
			
	}catch(Exception ex)
	{
		System.out.println(ex.getMessage());
	}

	}

}
