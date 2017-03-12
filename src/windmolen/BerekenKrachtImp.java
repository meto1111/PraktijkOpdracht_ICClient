/**
 * BerekenKrachtImp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package windmolen;

public interface BerekenKrachtImp extends java.rmi.Remote {
    public int windEngerie(int uur, int windsnelheid) throws java.rmi.RemoteException;
    public int berekenKracht(int windsnelheid, int vermogen) throws java.rmi.RemoteException;
}
