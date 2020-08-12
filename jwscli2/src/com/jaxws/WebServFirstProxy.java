package com.jaxws;

public class WebServFirstProxy implements com.jaxws.WebServFirst {
  private String _endpoint = null;
  private com.jaxws.WebServFirst webServFirst = null;
  
  public WebServFirstProxy() {
    _initWebServFirstProxy();
  }
  
  public WebServFirstProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebServFirstProxy();
  }
  
  private void _initWebServFirstProxy() {
    try {
      webServFirst = (new com.jaxws.WebServFirstImplServiceLocator()).getWebServFirstImplPort();
      if (webServFirst != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webServFirst)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webServFirst)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webServFirst != null)
      ((javax.xml.rpc.Stub)webServFirst)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.jaxws.WebServFirst getWebServFirst() {
    if (webServFirst == null)
      _initWebServFirstProxy();
    return webServFirst;
  }
  
  public void secondMeth(java.lang.String arg0) throws java.rmi.RemoteException{
    if (webServFirst == null)
      _initWebServFirstProxy();
    webServFirst.secondMeth(arg0);
  }
  
  public void firstMeth() throws java.rmi.RemoteException{
    if (webServFirst == null)
      _initWebServFirstProxy();
    webServFirst.firstMeth();
  }
  
  
}