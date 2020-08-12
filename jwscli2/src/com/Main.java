package com;

import java.util.ArrayList;
import java.util.List;

import com.jaxws.Product;
import com.jaxws.ProductServ;
import com.jaxws.ProductServImplService;
import com.jaxws.ProductServImplServiceLocator;
import com.jaxws.WebServFirst;
import com.jaxws.WebServFirstImplService;
import com.jaxws.WebServFirstImplServiceLocator;

public class Main {

	public static void main(String[] args) {
try {
			
			WebServFirstImplService webFirImlServ = new WebServFirstImplServiceLocator();
			
			WebServFirst fir = webFirImlServ.getWebServFirstImplPort();
			
			fir.firstMeth();
			fir.secondMeth("Kumar");
			ProductServImplService prodImplServ = new ProductServImplServiceLocator();
			ProductServ proServ = prodImplServ.getProductServImplPort();
			Product pr = proServ.find();
			System.out.println( "id "+pr.getProdId() + "name "+pr.getProdName() + "Price "+pr.getPrice());
			List<Product> lisPro = new ArrayList<>();
			Product[] prodLis = proServ.findAll();
			
			System.out.println("list values");
			for (Product product : prodLis) {
				System.out.println( "id "+product.getProdId() + " name "+product.getProdName() + " Price "+product.getPrice());
			}
			
			Product[] proLisDel =proServ.delete(1);
			System.out.println("delete");
			for (Product product : proLisDel) {
				System.out.println( "id "+product.getProdId() + " name "+product.getProdName() + " Price "+product.getPrice());
				
			}
			Product pro = new Product();
			pro.setPrice(1265.49f);
			pro.setProdName("touch pad");
			
			Product[] proLis = proServ.update(4, pro);
			System.out.println("update");
			for (Product product : proLis) {
				System.out.println( "id "+product.getProdId() + " name "+product.getProdName() + " Price "+product.getPrice());
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	

}
