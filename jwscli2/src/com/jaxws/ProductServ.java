/**
 * ProductServ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.jaxws;

public interface ProductServ extends java.rmi.Remote {
    public com.jaxws.Product[] update(int arg0, com.jaxws.Product arg1) throws java.rmi.RemoteException;
    public com.jaxws.Product find() throws java.rmi.RemoteException;
    public com.jaxws.Product[] delete(int arg0) throws java.rmi.RemoteException;
    public com.jaxws.Product[] findAll() throws java.rmi.RemoteException;
}
