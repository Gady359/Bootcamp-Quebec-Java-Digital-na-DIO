import one.gof.facade.Facade;
import one.gof.singleton.SingletonEager;
import one.gof.singleton.SingletonLazy;
import one.gof.singleton.SingletonLazyHolder;
import one.gof.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getInstancia();
        System.out.println(Eager);
        Eager=SingletonEager.getInstancia();
        System.out.println(Eager);

        SingletonLazyHolder LazyH = SingletonLazyHolder.getInstancia();
        System.out.println(LazyH);
        LazyH=SingletonLazyHolder.getInstancia();
        System.out.println(LazyH);

        //Strategy
        Comportamento defensivo=new ComportamentoDefensivo();
        Comportamento normal=new ComportamentoNormal();
        Comportamento agressivo=new ComportamentoAgressivo();

        Robo robo =new Robo();
        robo.setComportamento(agressivo);

        robo.mover();
        robo.mover();

        //Facede

        Facade facade=new Facade();
        facade.migrarCliente("Venilton","1440098");

    }
}