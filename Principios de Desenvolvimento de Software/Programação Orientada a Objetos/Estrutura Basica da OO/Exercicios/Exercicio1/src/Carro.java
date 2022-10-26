public class Carro extends Veiculo{


    String cor;
    String modelo;
    int capTanq;

    Carro(){

    }

    Carro(String cor,String modelo,int capTanq){
        this.cor=cor;
        this.modelo=modelo;
        this.capTanq=capTanq;
    }

    void setCor(String cor){
        this.cor=cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo=modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapTanq(int capTanq){
        this.capTanq=capTanq;
    }

    int getCapTanq(){
        return capTanq;
    }

    double totalValorTanque(double valorCombustivel){
        return capTanq * valorCombustivel;

    }
}
