public class Main {
    public static void main(String[] args) {

        //Retornos
        System.out.println("Exercicios Retornos");

        double areaQuadrado=Quadrilatero2.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo=Quadrilatero2.area(5,5);
        System.out.println("Area do reatangulo: " + areaRetangulo);

        double areaTrapezio=Quadrilatero2.area(7,8,9);
        System.out.println("Area do trapezio: " + areaTrapezio);

    }
}