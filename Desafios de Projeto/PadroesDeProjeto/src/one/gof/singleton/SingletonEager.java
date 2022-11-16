package one.gof.singleton;

//Singleton "Apressado"
public class SingletonEager {

    private  static SingletonEager instancia=new SingletonEager();

    private  SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){

        return instancia;
    }
}
