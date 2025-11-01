
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ConversorCliente{

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost");
            Conversor stub = (Conversor) registry.lookup("Conversor");
            int a = 20;

            System.out.println("De Fahrenheit para Celcius: " + stub.converterParaCelcius(a) + "°C");
            System.out.println("De Celcius  para Fahrenheit: " + stub.converterParaFahrenheit(a) + "°F");

            
        } catch (Exception e) {
        }
    }

}