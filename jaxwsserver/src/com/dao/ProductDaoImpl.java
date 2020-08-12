package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDaoImpl{

	
	public Product find() {
		Product pro = new Product(12, "Laptop", 45000.65f);
		return pro;
	}

	
	public List<Product> findAll() {
List<Product> pd = new ArrayList<Product>();

pd.add(new Product(13, "Mobile", 13016.65f));
pd.add(new Product(14, "keyboard", 523.49f));
pd.add(new Product(15, "mouse", 349.87f));
pd.add(new Product(18, "harddisk", 5628.89f));
pd.add(new Product(16, "pendrive", 450.65f));
pd.add(new Product(26, "ram", 3000.45f));

		return pd;
	}
	
	public List<Product> delete(int id) {
		List<Product> pda = new ArrayList<>();
		try
		{
		pda =findAll();
		
		pda.remove(id);
		
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.err.println("index not in range");
		}return pda;
	}

	
	
	public List<Product> update( int pos,Product produ) {
		List<Product>  pds = new ArrayList<>();
		try
		{
			pds =findAll();
		Product pro =pds.get(pos);
		
		System.out.println("pro id"+pro.getProdId());
	pro.setPrice(produ.getPrice());
	pro.setProdName(produ.getProdName());
		 pds.set(pos, pro);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("index out of range");
		}
		return pds;
	}

}
