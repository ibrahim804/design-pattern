// Java program to implement the Search interface
import java.rmi.*;
import java.rmi.server.*;
public class Addc extends UnicastRemoteObject
                         implements Addi
{
    // Default constructor to throw RemoteException
    // from its parent constructor
    Addc() throws RemoteException
    {
        super();
    }
 
    // Implementation of the query interface
    public String print() throws RemoteException
    {
       return "Jamil";
    }
}
