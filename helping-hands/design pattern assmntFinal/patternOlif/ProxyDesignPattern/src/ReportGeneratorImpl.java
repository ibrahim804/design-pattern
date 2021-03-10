
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class ReportGeneratorImpl extends UnicastRemoteObject implements ReportGenerator {

	// private static final long serialVersionUID = 3107413009881629428L;

	protected ReportGeneratorImpl() throws RemoteException {
	}

	@Override
	public String generateReport() throws RemoteException {
		StringBuilder sb = new StringBuilder();

		sb.append("\\report generated on " + new Date());

		return sb.toString();
	}

	public static void main(String[] args) {

		try {
			System.out.println("server started successfully");
			ReportGenerator reportGenerator = new ReportGeneratorImpl();
			Naming.rebind("PizzaCoRemoteGenerator", reportGenerator);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
