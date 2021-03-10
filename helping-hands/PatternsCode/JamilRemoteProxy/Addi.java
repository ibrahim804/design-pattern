
import java.rmi.*;
public interface Addi extends Remote
{
    // Declaring the method prototype
   // public String query(String search) throws RemoteException;
        public String print() throws RemoteException;
}
