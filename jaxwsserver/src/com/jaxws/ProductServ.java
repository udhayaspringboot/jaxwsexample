package com.jaxws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.model.Product;

@WebService
public interface ProductServ {
	@WebMethod
	public Product find();
	@WebMethod
	public List<Product> findAll();
	@WebMethod
	public List<Product> delete(int id);
	@WebMethod
	public List<Product> update(int pos,Product produ);

}
