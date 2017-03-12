/**
 * BerekenKrachtImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package windmolen;

public class BerekenKrachtImpServiceLocator extends org.apache.axis.client.Service implements windmolen.BerekenKrachtImpService {

    public BerekenKrachtImpServiceLocator() {
    }


    public BerekenKrachtImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BerekenKrachtImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BerekenKrachtImp
    private java.lang.String BerekenKrachtImp_address = "http://localhost:8081/PraktijkOpdracht_IC/services/BerekenKrachtImp";

    public java.lang.String getBerekenKrachtImpAddress() {
        return BerekenKrachtImp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BerekenKrachtImpWSDDServiceName = "BerekenKrachtImp";

    public java.lang.String getBerekenKrachtImpWSDDServiceName() {
        return BerekenKrachtImpWSDDServiceName;
    }

    public void setBerekenKrachtImpWSDDServiceName(java.lang.String name) {
        BerekenKrachtImpWSDDServiceName = name;
    }

    public windmolen.BerekenKrachtImp getBerekenKrachtImp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BerekenKrachtImp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBerekenKrachtImp(endpoint);
    }

    public windmolen.BerekenKrachtImp getBerekenKrachtImp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            windmolen.BerekenKrachtImpSoapBindingStub _stub = new windmolen.BerekenKrachtImpSoapBindingStub(portAddress, this);
            _stub.setPortName(getBerekenKrachtImpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBerekenKrachtImpEndpointAddress(java.lang.String address) {
        BerekenKrachtImp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (windmolen.BerekenKrachtImp.class.isAssignableFrom(serviceEndpointInterface)) {
                windmolen.BerekenKrachtImpSoapBindingStub _stub = new windmolen.BerekenKrachtImpSoapBindingStub(new java.net.URL(BerekenKrachtImp_address), this);
                _stub.setPortName(getBerekenKrachtImpWSDDServiceName());
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
        if ("BerekenKrachtImp".equals(inputPortName)) {
            return getBerekenKrachtImp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://windmolen", "BerekenKrachtImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://windmolen", "BerekenKrachtImp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BerekenKrachtImp".equals(portName)) {
            setBerekenKrachtImpEndpointAddress(address);
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
