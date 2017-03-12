package windmolen;

public class BerekenKrachtImpProxy implements windmolen.BerekenKrachtImp {
  private String _endpoint = null;
  private windmolen.BerekenKrachtImp berekenKrachtImp = null;
  
  public BerekenKrachtImpProxy() {
    _initBerekenKrachtImpProxy();
  }
  
  public BerekenKrachtImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initBerekenKrachtImpProxy();
  }
  
  private void _initBerekenKrachtImpProxy() {
    try {
      berekenKrachtImp = (new windmolen.BerekenKrachtImpServiceLocator()).getBerekenKrachtImp();
      if (berekenKrachtImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)berekenKrachtImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)berekenKrachtImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (berekenKrachtImp != null)
      ((javax.xml.rpc.Stub)berekenKrachtImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public windmolen.BerekenKrachtImp getBerekenKrachtImp() {
    if (berekenKrachtImp == null)
      _initBerekenKrachtImpProxy();
    return berekenKrachtImp;
  }
  
  public int windEngerie(int uur, int windsnelheid) throws java.rmi.RemoteException{
    if (berekenKrachtImp == null)
      _initBerekenKrachtImpProxy();
    return berekenKrachtImp.windEngerie(uur, windsnelheid);
  }
  
  public int berekenKracht(int windsnelheid, int vermogen) throws java.rmi.RemoteException{
    if (berekenKrachtImp == null)
      _initBerekenKrachtImpProxy();
    return berekenKrachtImp.berekenKracht(windsnelheid, vermogen);
  }
  
  
}