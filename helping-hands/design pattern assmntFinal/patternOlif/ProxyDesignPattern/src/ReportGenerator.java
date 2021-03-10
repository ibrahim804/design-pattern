

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ReportGenerator extends Remote{

	public String generateReport() throws RemoteException;

}
