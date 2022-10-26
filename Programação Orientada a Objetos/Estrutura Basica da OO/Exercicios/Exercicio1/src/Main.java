public class Main {
    public static void main(String[] args) {

        Carro carro1=new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW Serie 3");
        carro1.setCapTanq(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapTanq());
        System.out.println(carro1.totalValorTanque(6.39));

        Carro carro2=new Carro("Cinza","Mercedes-Benz Classe C",66);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapTanq());
        System.out.println(carro2.totalValorTanque(6.46));
    }
}