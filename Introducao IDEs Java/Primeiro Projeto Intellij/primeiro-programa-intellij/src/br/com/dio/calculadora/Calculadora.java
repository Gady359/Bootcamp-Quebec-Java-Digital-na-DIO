package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;

        System.out.printf("Digite o primeiro valor: ");
        a= scan.nextInt();
        System.out.printf("Digite o segundo valor: ");
        b= scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Somar: "+ somar);
        System.out.println("Sobt: "+ subtrair);
        System.out.println("Mult: "+ multiplicar);
        System.out.println("Div: "+ dividir);

    }

    public static int somar(int a, int b){
        return a+b;
    }public static int subtrair(int a, int b){
        return a-b;
    }public static int multiplicar(int a, int b){
        return a*b;
    }public static int dividir(int a, int b){
        return a/b;
    }

}
