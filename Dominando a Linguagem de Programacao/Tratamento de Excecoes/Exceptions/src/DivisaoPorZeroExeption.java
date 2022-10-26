public class DivisaoPorZeroExeption extends Exception{
    private int numerador;
    private int denominador;

    public DivisaoPorZeroExeption(String message, int numerador, int denominador) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}