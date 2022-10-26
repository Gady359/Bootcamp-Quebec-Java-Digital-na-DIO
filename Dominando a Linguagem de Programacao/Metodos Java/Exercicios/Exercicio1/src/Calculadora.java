public class Calculadora {

    public static void soma(double numero1, double numero2){

        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " resulta em: " + resultado);
    }

    public static void subtrai(double numero1, double numero2){

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " menos " + numero2 + " resulta em: " + resultado);
    }

    public static void multiplica(double numero1, double numero2){

        double resultado = numero1 * numero2;

        System.out.println("A multiplicacao de " + numero1 + " vezes " + numero2 + " resulta em: " + resultado);
    }

    public static void divide(double numero1, double numero2){

        double resultado = numero1 / numero2;

        System.out.println("A divisao de " + numero1 + " dividido por " + numero2 + " resulta em: " + resultado);
    }

}
