public abstract class Conta implements Iconta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    protected String chavePix;





    public Conta(Cliente cliente){
        this.agencia=Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente=cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    public String getChavePix() {return chavePix;}



    protected void imprimirIfosComuns() {
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d",this.agencia));
        System.out.println(String.format("Conta: %d",this.numero));
        System.out.println(String.format("Saldo: %.2f",this.saldo));
        System.out.println(String.format("Chave Pix: %s",this.chavePix));
    }


}