package com.jaxws;

import java.util.List;

import javax.jws.WebService;

import com.dao.ProductDaoImpl;
import com.model.Product;
@WebService(endpointInterface = "com.jaxws.ProductServ")
public class ProductServImpl implements ProductServ {

	ProductDaoImpl prodDao =  new ProductDaoImpl();
	
	@Override
	public Product find() {
		Product pro = prodDao.find();
		return pro;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		List<Product> lis = prodDao.findAll();
		return lis;
	}

	@Override
	public List<Product> delete(int id) {
		
		List<Product> lisVal = prodDao.delete(id);
		return lisVal;

	}

	@Override
	public List<Product> update(int pos,Product produ) {
		List<Product> lise = prodDao.update(pos, produ);
		return lise;

	}

}
