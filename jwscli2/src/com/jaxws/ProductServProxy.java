package com.jaxws;

public class ProductServProxy implements com.jaxws.ProductServ {
  private String _endpoint = null;
  private com.jaxws.ProductServ productServ = null;
  
  public ProductServProxy() {
    _initProductServProxy();
  }
  
  public ProductServProxy(String endpoint) {
    _endpoint = endpoint;
    _initProductServProxy();
  }
  
  private void _initProductServProxy() {
    try {
      productServ = (new com.jaxws.ProductServImplServiceLocator()).getProductServImplPort();
      if (productServ != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)productServ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)productServ)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (productServ != null)
      ((javax.xml.rpc.Stub)productServ)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jaxws.ProductServ getProductServ() {
    if (productServ == null)
      _initProductServProxy();
    return productServ;
  }
  
  public com.jaxws.Product[] update(int arg0, com.jaxws.Product arg1) throws java.rmi.RemoteException{
    if (productServ == null)
      _initProductServProxy();
    return productServ.update(arg0, arg1);
  }
  
  public com.jaxws.Product find() throws java.rmi.RemoteException{
    if (productServ == null)
      _initProductServProxy();
    return productServ.find();
  }
  
  public com.jaxws.Product[] delete(int arg0) throws java.rmi.RemoteException{
    if (productServ == null)
      _initProductServProxy();
    return productServ.delete(arg0);
  }
  
  public com.jaxws.Product[] findAll() throws java.rmi.RemoteException{
    if (productServ == null)
      _initProductServProxy();
    return productServ.findAll();
  }
  
  
}