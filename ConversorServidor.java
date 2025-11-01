
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class ConversorServidor{

    public static void main(String[] args) throws RemoteException {
        try {
             ImplementsConversor server = new ImplementsConversor();
             Conversor stub = (Conversor) UnicastRemoteObject.exportObject(server, 0);

             Registry registry = LocateRegistry.createRegistry(1099);
             registry.rebind("Conversor", stub);
             System.out.println("SErvidor Pronto ... ");
            
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }     
        
    }
    
}
