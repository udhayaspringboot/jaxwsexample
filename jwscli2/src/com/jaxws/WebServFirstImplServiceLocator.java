/**
 * WebServFirstImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jaxws;

public class WebServFirstImplServiceLocator extends org.apache.axis.client.Service implements com.jaxws.WebServFirstImplService {

    public WebServFirstImplServiceLocator() {
    }


    public WebServFirstImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebServFirstImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebServFirstImplPort
    private java.lang.String WebServFirstImplPort_address = "http://localhost:8944/com/jaxws/WebServFirst";

    public java.lang.String getWebServFirstImplPortAddress() {
        return WebServFirstImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebServFirstImplPortWSDDServiceName = "WebServFirstImplPort";

    public java.lang.String getWebServFirstImplPortWSDDServiceName() {
        return WebServFirstImplPortWSDDServiceName;
    }

    public void setWebServFirstImplPortWSDDServiceName(java.lang.String name) {
        WebServFirstImplPortWSDDServiceName = name;
    }

    public com.jaxws.WebServFirst getWebServFirstImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebServFirstImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebServFirstImplPort(endpoint);
    }

    public com.jaxws.WebServFirst getWebServFirstImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.jaxws.WebServFirstImplPortBindingStub _stub = new com.jaxws.WebServFirstImplPortBindingStub(portAddress, this);
            _stub.setPortName(getWebServFirstImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebServFirstImplPortEndpointAddress(java.lang.String address) {
        WebServFirstImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.jaxws.WebServFirst.class.isAssignableFrom(serviceEndpointInterface)) {
                com.jaxws.WebServFirstImplPortBindingStub _stub = new com.jaxws.WebServFirstImplPortBindingStub(new java.net.URL(WebServFirstImplPort_address), this);
                _stub.setPortName(getWebServFirstImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebServFirstImplPort".equals(inputPortName)) {
            return getWebServFirstImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxws.com/", "WebServFirstImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxws.com/", "WebServFirstImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebServFirstImplPort".equals(portName)) {
            setWebServFirstImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
