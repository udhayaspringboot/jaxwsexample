package com.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebServFirst {
	
	@WebMethod
	public void firstMeth();
	@WebMethod
	public void secondMeth(String name);
	

}
