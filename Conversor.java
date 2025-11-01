
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Conversor extends Remote {
    double converterParaFahrenheit(int valor) throws RemoteException;
    double converterParaCelcius(int valor) throws RemoteException;

    
}
