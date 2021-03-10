//program for client application
import java.rmi.*;
public class Client
{
    public static void main(String args[])
    {
        
        try
        {
            // lookup method to find reference of remote object
            Addi access =
                (Addi)Naming.lookup("rmi://localhost:1900"+
                                      "/geeksforgeeks");
             System.out.println("Hello "+access.print());
            //System.out.println("Article on " + value +
              //              " " + answer+" at GeeksforGeeks");
        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}
