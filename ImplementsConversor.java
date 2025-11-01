public class ImplementsConversor implements Conversor {

    @Override
    public double converterParaFahrenheit(int valor) {
        return (valor * 9 / 5) + 32;      
    }

    @Override
    public double converterParaCelcius(int valor) {
        return ((valor - 32) / 9) * 5;
    }
    
}
